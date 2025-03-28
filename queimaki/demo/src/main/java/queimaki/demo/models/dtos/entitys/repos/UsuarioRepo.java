package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository.Query;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    
    @Query("SELECT u FROM Usuario u WHERE u.email = ?1")
    Usuario findByEmail(String email);
    
    @Query("SELECT u FROM Usuario u WHERE u.senha = ?1")
    Usuario findByCpf(String cpf);
    
    @Query("SELECT u FROM Usuario u WHERE u.cpf = ?1 AND u.senha = ?2")
    Usuario findByCpfAndSenha(String cpf, String senha);
}
    