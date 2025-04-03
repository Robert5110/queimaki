package queimaki.demo.models.dtos.entitys.repos;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
@Repository
public interface UsuarioRepo extends JpaRepository<UsuarioEntitys, Long> {

Optional<UsuarioEntitys> findByNomeUserAndEmailUser(String nomeUser, String emailUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE u.nomeUser = ?1")
public UsuarioEntitys findByNomeUserandEmailUser(String nomeUser, String emailUser);

}