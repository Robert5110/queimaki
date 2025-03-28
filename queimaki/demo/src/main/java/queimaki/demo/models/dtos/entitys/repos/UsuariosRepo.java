package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Usuarios;
import queimaki.demo.models.dtos.entitys.UsuariosId;

@Repository
public interface UsuariosRepo extends JpaRepository<Usuarios, UsuariosId> {
    
}