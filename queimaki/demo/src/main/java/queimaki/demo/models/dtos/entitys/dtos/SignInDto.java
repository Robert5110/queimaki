package queimaki.demo.models.dtos.entitys.dtos;

import lombok.Data;

@Data
public class SignInDto 
{
    private String nomeUserOrEmailUser;
    private String senhaUser;
}