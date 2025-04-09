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

@Table(name = "produtos")
public class ProdutosEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produ")
    private long idProdu;

    @Column(name = "nome_produ", nullable = false)
    private String nomeProdu;

    @Column(name = "descricao_produ")
    private String descricaoProdu;

    @Column(name = "preco_prod", nullable = false)
    private double precoProdu;

    @ManyToOne
    @JoinColumn(name = "id_categ")
    private CategoriaEntitys categoria;

    @ManyToOne
    @JoinColumn(name = "id_forn")
    private FornecedorEntitys fornecedor;

    
}

