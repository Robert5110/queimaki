package queimaki.demo.entitys.repos;

import java.time.LocalDate;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.entitys.entitys.PromocoesEntitys;

@Repository
public interface PromocoesRepo extends JpaRepository<PromocoesEntitys, Integer> {
    

    
    @Query("SELECT p FROM PromocoesEntitys p WHERE p.idPromo = ?1")
    PromocoesEntitys findByIdPromo(PromocoesEntitys idPromo);
    
   

    @Query("SELECT p FROM PromocoesEntitys p WHERE p.plataforma = ?1")
    PromocoesEntitys findByPlataforma(String plataforma);

    @Query("SELECT p FROM PromocoesEntitys p WHERE p.tipoPromocao = ?1")
    PromocoesEntitys findByTipoPromocao(String tipoPromocao);

    @Query("SELECT p FROM PromocoesEntitys p WHERE p.desconto = ?1")
    PromocoesEntitys findByDesconto(String desconto);

    @Query("SELECT p FROM PromocoesEntitys p WHERE p.periodoInicioPromo = ?1")
    PromocoesEntitys findByPeriodoInicioPromo(LocalDate periodoInicioPromo);

    @Query("SELECT p FROM PromocoesEntitys p WHERE p.periodoFimPromo = ?1")
    PromocoesEntitys findByPeriodoFimPromo(LocalDate periodoFimPromo);


    


PromocoesEntitys findByIdPromo(Integer idPromo);
    
}