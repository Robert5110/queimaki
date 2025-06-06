package queimaki.demo.entitys.entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "administrador")
public class AdiministradorEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Integer idAdmin;

    @Column(name = "nome_admin", nullable = false)
    private String nomeAdmin;

    @Column(name = "email_admin")
    private String emailAdmin;

    @Column(name = "senha_admin")
    private String senhaAdmin;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UsuarioEntitys usuario; 

    

    public AdiministradorEntitys() {
    }
}

