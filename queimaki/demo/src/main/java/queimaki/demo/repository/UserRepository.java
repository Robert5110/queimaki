package queimaki.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import queimaki.demo.entitys.entitys.UsuarioEntitys;


public interface UserRepository extends JpaRepository<UsuarioEntitys, Long>{

    Optional<UsuarioEntitys> findByEmail(String email);

    Optional<UsuarioEntitys> findByNameOrEmail(String name, String email);

    Optional<UsuarioEntitys> findByName(String name);

    boolean existsByName(String name);

    boolean existsByEmail(String email);

    boolean existsByNameOrEmail(String name, String email);

}