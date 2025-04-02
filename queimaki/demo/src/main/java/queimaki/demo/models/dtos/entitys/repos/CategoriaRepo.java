package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.entitys.CategoriaEntitys;

@Repository
public interface CategoriaRepo extends JpaRepository<CategoriaEntitys, Long> {
    
    @Query("SELECT c FROM CategoriaEntitys c WHERE c.idCateg = ?1")
    CategoriaEntitys findByIdCat(CategoriaEntitys idCateg);
    
    @Query("SELECT c FROM CategoriaEntitys c WHERE c.nome_Categ = ?1")
    CategoriaEntitys findByNomeCat(String nomeCateg);
    
    @Query("SELECT c FROM CategoriaEntitys c WHERE c.descricao= ?1")
    CategoriaEntitys findByDescricaoCat(String descricao);
    
}