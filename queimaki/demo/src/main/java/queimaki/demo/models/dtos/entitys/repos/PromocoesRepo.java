package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Promocoes;
import queimaki.demo.models.dtos.entitys.PromocoesId;

@Repository
public interface PromocoesRepo extends JpaRepository<Promocoes, PromocoesId> {
    
}