package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Fornecedor;
import queimaki.demo.models.dtos.entitys.FornecedorId;

@Repository
public interface FornecedorRepo extends JpaRepository<Fornecedor, FornecedorId> {
    
}