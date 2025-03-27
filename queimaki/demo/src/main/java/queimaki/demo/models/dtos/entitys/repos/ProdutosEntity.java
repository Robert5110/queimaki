package queimaki.demo.models.dtos.entitys;

import java.io.Serializable;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

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
public class ProdutosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prod")
    private long idProd;

    @Column(name = "nome_prod", nullable = false)
    private String nomeProd;

    @Column(name = "descricao_produ")
    private String descricaoProd;

    @COLUMN(name = "preco_prod", nullable = false)
    private double precoProd;

    @ManyToOne
    @JoinColumn(name = "id_categ") // Nome da coluna na tabela 'usuario' que é a chave estrangeira
    private RoleEntity categoria;

    @JoinColumn(name = "id_forn")
    private FornecedorEntity fornecedor;


    
}



public class ProdutosEntity {
    
}
