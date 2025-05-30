package queimaki.demo.models.dtos.entitys.dtos;

import lombok.Data;

@Data
public class cadastroDto 
{

    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;

}