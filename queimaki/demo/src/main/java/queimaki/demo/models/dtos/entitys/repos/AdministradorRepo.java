package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Administrador;
import queimaki.demo.models.dtos.entitys.AdministradorId;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrador, AdministradorId> {
    
}