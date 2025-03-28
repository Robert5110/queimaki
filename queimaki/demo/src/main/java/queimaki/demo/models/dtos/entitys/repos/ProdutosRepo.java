package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Produtos;
import queimaki.demo.models.dtos.entitys.ProdutosId;

@Repository
public interface ProdutosRepo extends JpaRepository<Produtos, ProdutosId> {
    
}