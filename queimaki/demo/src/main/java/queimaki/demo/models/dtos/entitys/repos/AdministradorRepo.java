package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.AdiministradorEntitys;

@Repository
public interface AdministradorRepo extends JpaRepository<AdiministradorEntitys, Long> {
    
    @Query("SELECT a FROM AdministradorEntitys a WHERE a.nome_admin = ?1")
    AdiministradorEntitys findByNomeAdmin(String nomeAdmin);
    
    @Query("SELECT a FROM AdministradorEntitys a WHERE a.email_admin = ?1")
    AdiministradorEntitys findByEmailAdmin(String emailAdmin);
    
    @Query("SELECT a FROM AdministradorEntitys a WHERE a.senha_admin = ?1")
    AdiministradorEntitys findBySenhaAdmin(String senhaAdmin);
    
   
}
