package queimaki.demo.models.dtos.entitys.entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class UsuarioEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user") 
    private Integer idUser;

    @Column(name = "nome_user", nullable = false) 
    private String nomeUser; 

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "senha_user") 
    private String senhaUser; 

    @Column(name = "confirma_senha") 
    private String confirmaSenha; 


    public UsuarioEntitys() {
    }
}