package queimaki.demo.models.dtos.entitys.entitys;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

@Table(name = "promocoes") 
public class PromocoesEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promo")
    private Integer idPromo; 

    @Column(name = "plataforma", nullable = false, length = 100)
    private String plataforma; 

    @Column(name = "tipo_promocao", nullable = false, length = 100)
    private String tipoPromocao; 

    @Column(name = "desconto")
    private String desconto; 

    @Column(name = "periodo_inicio_promo")
    private LocalDate periodoInicioPromo; 

    @Column(name = "periodo_fim_promo")
    private LocalDate periodoFimPromo; 

    public PromocoesEntitys() {
    }
}