package queimaki.demo.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.entitys.entitys.FornecedorEntitys;

@Repository
public interface FornecedorRepo extends JpaRepository<FornecedorEntitys, Long> {
    
    @Query("SELECT f FROM FornecedorEntitys f WHERE f.nome_Forne = ?1")
    FornecedorEntitys findByNomeForne(String nomeForne);

    @Query("SELECT f FROM FornecedorEntitys f WHERE f.cnpj_forne = ?1")
    FornecedorEntitys findByCnpjForne(String cnpjForne);
    
    @Query("SELECT f FROM FornecedorEntitys f WHERE f.email_forne = ?1")
    FornecedorEntitys findByEmailForne(String emailForne);


    
   
    
}