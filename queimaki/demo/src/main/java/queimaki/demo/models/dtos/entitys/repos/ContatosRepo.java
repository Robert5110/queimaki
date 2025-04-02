package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.ContatosEntitys;

@Repository
public interface ContatosRepo extends JpaRepository<ContatosEntitys, Long> {
    
    @Query("SELECT c FROM ContatosEntitys c WHERE c.nome_cont = ?1")
    ContatosEntitys findByNomeContato(String nomeCont);
    
    @Query("SELECT c FROM ContatosEntitys c WHERE c.email_Cont = ?1")
    ContatosEntitys findByEmailContato(String emailCont);
    
    @Query("SELECT c FROM ContatosEntitys c WHERE c.telefone_Cont = ?1")
    ContatosEntitys findByTelefoneContato(String telefoneCont);

}