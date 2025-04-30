package queimaki.demo.models.dtos.entitys.dtos;

import lombok.Data;

@Data
public class SignUpDto 
{


    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;
}