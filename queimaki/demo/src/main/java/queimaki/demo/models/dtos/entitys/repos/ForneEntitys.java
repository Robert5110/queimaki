package queimaki.demo.models.dtos.entitys;

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
@Table(name = "forne")
public class ForneEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forne")
    private Long idForne; 

    @Column(name = "nome_forne")
    private String nomeForne; 

    @Column(name = "cnpj_forne")
    private String cnpjForne; 

    @Column(name = "email_forne")
    private String emailUser; 

    @Column(name = "telefone_forne") //
    private String telefoneForne; 


    @ManyToMany
    private List<CollectrequestEntity> collectrequest;

}