package queimaki.demo.models.dtos.entitys.repos;

//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.CategoriaEntitys;

@Repository
public interface CategoriaRepo extends JpaRepository<CategoriaEntitys, Long> {
    
    
    
}