package queimaki.demo.models.dtos.entitys.entitys;

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
@Table(name = "contatos")
public class ContatosEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    private Integer idContato;

    @Column(name = "nome_cont", nullable = false)
    private String nomeCont;

    @Column(name = "email_cont")
    private String emailCont;

    @Column(name = "telefone_cont", length = 50)
    private String telefoneCont;

    @ManyToOne
    @JoinColumn(name = "id_forne")
    private FornecedorEntitys fornecedor; // Referência à entidade Fornecedor

  
public class ContatosEnititys {
    
}
}