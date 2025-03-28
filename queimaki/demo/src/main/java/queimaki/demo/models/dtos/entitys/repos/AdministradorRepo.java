package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository.Query;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Administrador;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrador, Long> {
    
    @Query("SELECT a FROM Administrador a WHERE a.email = ?1")
    Optional<Administrador> findByEmail(String email);
    
    @Query("SELECT a FROM Administrador a WHERE a.senha = ?1")
    Optional<Administrador> findBySenha(String senha);
    
    @Query("SELECT a FROM Administrador a WHERE a.email = ?1 AND a.senha = ?2")
    Optional<Administrador> findByEmailAndSenha(String email, String senha);
}