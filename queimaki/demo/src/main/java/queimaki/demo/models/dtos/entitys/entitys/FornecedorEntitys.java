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
@Table(name = "fornecedor")
public class FornecedorEntitys implements Serializable {

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
    private String emailForne; 






}