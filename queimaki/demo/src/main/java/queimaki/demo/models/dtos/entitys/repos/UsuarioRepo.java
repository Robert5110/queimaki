package queimaki.demo.models.dtos.entitys.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;   
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;

@Repository
public interface UsuarioRepo extends JpaRepository<UsuarioEntitys, Long> {
    

@Query("SELECT u FROM UsuarioEntitys u WHERE u.nomeUser = ?1 AND u.emailUser = ?2")
public Optional<UsuarioEntitys> findByNomeUserAndEmailUser(String nomeUser, String emailUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE (u.nomeUser = ?1 OR u.emailUser = ?1) AND u.senhaUser = ?2")
public Optional<UsuarioEntitys> findByNomeUserOrEmailUserAndSenhaUser(String nomeUser, String senhaUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE u.senhaUser = ?1")
public Optional<UsuarioEntitys> findBySenhaUser(String senhaUser);

Optional<UsuarioEntitys> findByEmailUser(String emailUser);

Optional<UsuarioEntitys> findByNomeUserOrEmailUser(String nomeUser, String emailUser);

Optional<UsuarioEntitys> findByNomeUser(String nomeUser);

boolean existsByNomeUser(String nomeUser);

boolean existsByEmailUser(String emailUser);

boolean existsByNomeUserOrEmailUser(String nomeUser, String emailUSer);

}

