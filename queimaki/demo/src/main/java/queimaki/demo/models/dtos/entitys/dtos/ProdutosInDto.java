package queimaki.demo.models.dtos.entitys.dtos;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ProdutosInDto{

    private String nomeProdu;
    private String descricaoProdu;
    private double precoProdu;


    public ProdutosInDto() {
    }

    public ProdutosInDto(String nomeProdu, String descricaoProdu, double precoProdu, Long idForne) {
        this.nomeProdu = nomeProdu;
        this.descricaoProdu = descricaoProdu;
        this.precoProdu = precoProdu;
    }

    public ProdutosInDto(String nomeProdu, String descricaoProdu, double precoProdu) {
        this.nomeProdu = nomeProdu;
        this.descricaoProdu = descricaoProdu;
    }

    public ProdutosInDto(ProdutosDto produtos) {
        this.nomeProdu = produtos.getNomeProdu();
        this.descricaoProdu = produtos.getDescricaoProdu();
        this.precoProdu = produtos.getPrecoProdu();
    }

}