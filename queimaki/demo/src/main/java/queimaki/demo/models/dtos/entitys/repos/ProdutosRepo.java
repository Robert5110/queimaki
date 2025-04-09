package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.ProdutosEntitys;

@Repository
public interface ProdutosRepo extends JpaRepository<ProdutosEntitys, Long> {
    
    @Query("SELECT p FROM ProdutosEntitys p WHERE p.idProd = ?1")
    ProdutosEntitys findByIdProd(ProdutosEntitys idProdu);
    
    @Query("SELECT p FROM ProdutosEntitys p WHERE p.nome_Prod = ?1")
    ProdutosEntitys findByNomeProd(String nomeProdu);
    
    @Query("SELECT p FROM ProdutosEntitys p WHERE p.descricao_Produ = ?1")
    ProdutosEntitys findByDescricaoProd(String descricaoProdu);
    
    @Query("SELECT p FROM ProdutosEntitys p WHERE p.preco_Prod = ?1")
    ProdutosEntitys findByPrecoProd(double precoProdu);
    
}