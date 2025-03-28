package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Categoria;
import queimaki.demo.models.dtos.entitys.CategoriaId;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, CategoriaId> {
    
}