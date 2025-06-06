package queimaki.demo.entitys.entitys;

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
@Table(name = "categoria")
public class CategoriaEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categ")
    private Integer idCateg;

    @Column(name = "nome_categ", nullable = false)
    private String nomeCateg;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;


    public CategoriaEntitys() {
    }
}