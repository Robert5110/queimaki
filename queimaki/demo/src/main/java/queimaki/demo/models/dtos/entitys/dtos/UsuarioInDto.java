package queimaki.demo.models.dtos.entitys.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioInDto {

    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;

    public UsuarioInDto() {
    }

    public UsuarioInDto(String nomeUser, String emailUser, String senhaUser, String confirmaSenha){
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUser;
        this.confirmaSenha = confirmaSenha;
    }

    public UsuarioInDto(String nomeUser, String emailUser, String senhaUser){
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUser;

    }

    public UsuarioInDto(UsuarioDto usuario){
        this.nomeUser = usuario.getNomeUser();
        this.emailUser = usuario.getEmailUser();
        this.senhaUser = usuario.getSenhaUser();
        this.confirmaSenha = usuario.getConfirmaSenha();

        


    }
    


}