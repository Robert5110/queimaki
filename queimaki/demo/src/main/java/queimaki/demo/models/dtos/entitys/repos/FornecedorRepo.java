package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.FornecedorEntitys;

@Repository
public interface FornecedorRepo extends JpaRepository<FornecedorEntitys, Long> {
    
    @Query("SELECT f FROM FornecedorEntitys f WHERE f.nome_Forne = ?1")
    FornecedorEntitys findByNomeFornecedor(String nomeForne);

    @Query("SELECT f FROM FornecedorEntitys f WHERE f.cnpj_forne = ?1")
    FornecedorEntitys findByCnpj(String cnpjForne);
    
    @Query("SELECT f FROM FornecedorEntitys f WHERE f.email_forne = ?1")
    FornecedorEntitys findByEmailFornecedor(String emailForne);

    @Query("SELECT f FROM FornecedorEntitys f WHERE f.telefone_forne = ?1")
    FornecedorEntitys findByTelefoneFornecedor(String telefoneForne);

    
   
    
}