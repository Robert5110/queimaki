package queimaki.demo.models.dtos.entitys.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;   
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
@Repository
public interface UsuarioRepo extends JpaRepository<UsuarioEntitys, Long> {
    

@Query("SELECT u FROM UsuarioEntitys u WHERE u.nomeUser = ?1 AND u.emailUser = ?2")
public Optional<UsuarioEntitys> findByNomeUserAndEmailUser(String nomeUSer, String emailUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE (u.nomeUser = ?1 OR u.emailUser = ?1) AND u.senhaUser = ?2")
public Optional<UsuarioEntitys> findByNomeUserOrEmailUserAndSenhaUser(String nomeUser, String senhaUser);

}