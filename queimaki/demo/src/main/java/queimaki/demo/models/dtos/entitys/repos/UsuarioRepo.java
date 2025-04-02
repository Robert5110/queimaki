package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
@Repository
public interface UsuarioRepo extends JpaRepository<UsuarioEntitys, Long> {

@Query("SELECT u FROM UsuarioEntitys u WHERE u.nomeUser = ?1")
UsuarioEntitys findByNomeUser(String nomeUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE u.emailUser = ?1")
UsuarioEntitys findByEmailUser(String emailUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE u.senhaUser = ?1")
UsuarioEntitys findBySenhaUser(String senhaUser);

@Query("SELECT u FROM UsuarioEntitys u WHERE u.confirmaSenha = ?1")
UsuarioEntitys findByConfirmaSenha(String confirmaSenha);

}