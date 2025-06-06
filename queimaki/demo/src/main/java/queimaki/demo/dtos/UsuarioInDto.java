package queimaki.demo.dtos;

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

    public UsuarioInDto(UsuarioInDto usuario){
        
        if (usuario.getNomeUser() != null) this.nomeUser = usuario.getNomeUser();
        if (usuario.getEmailUser() != null) this.emailUser = usuario.getEmailUser();
        if (usuario.getSenhaUser() != null) this.senhaUser = usuario.getSenhaUser();
        
            
    }

    


}