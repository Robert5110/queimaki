package queimaki.demo.models.dtos.entitys.dtos;

import queimaki.demo.models.dtos.entitys.entitys.ProdutosEntitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProdutosDto {

    private Long idProdu;
    private String nomeProdu;
    private String descricaoProdu;
    private double precoProdu;

    public ProdutosDto() {
    }

    public ProdutosDto(Long idProdu, String nomeProdu, String descricaoProdu, Double precoProdu) {

        if (idProdu != null) this.idProdu = idProdu;
        if (nomeProdu != null) this.nomeProdu = nomeProdu;
        if (descricaoProdu != null) this.descricaoProdu = descricaoProdu;
        if (precoProdu != null) this.precoProdu = precoProdu;

    }

    public ProdutosDto(String nomeProdu, String descricaoProdu, Double precoProdu) {

        if (nomeProdu != null) this.nomeProdu = nomeProdu;
        if (descricaoProdu != null) this.descricaoProdu = descricaoProdu;
        if (precoProdu != null) this.precoProdu = precoProdu;

    }

    public ProdutosDto(String nomeProdu, String descricaoProdu) {

        if (nomeProdu != null) this.nomeProdu = nomeProdu;
        if (descricaoProdu != null) this.descricaoProdu = descricaoProdu;

    }
    public ProdutosDto(ProdutosEntitys produtos) {
        if (null != produtos) {
            this.idProdu = produtos.getIdProdu();
            this.nomeProdu = produtos.getNomeProdu();
            this.descricaoProdu = produtos.getDescricaoProdu();
            this.precoProdu = produtos.getPrecoProdu();
        }
    } 





}