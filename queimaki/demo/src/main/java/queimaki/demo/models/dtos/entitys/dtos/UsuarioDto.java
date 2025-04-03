package queimaki.demo.models.dtos.entitys.dtos;

import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDto {

    private Integer idUser;
    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;
   
    public UsuarioDto() {
    }

    public UsuarioDto(Long idUser, String nomeUser, String emailUser, String senhaUser, String confirmaSenha) {
       if (idUser != null) this.idUser = idUser.intValue();
       if (nomeUser != null) this.nomeUser = nomeUser;
       if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;
        if (confirmaSenha != null) this.confirmaSenha = confirmaSenha;
    }

    public UsuarioDto(String nomeUser, String emailUser, String senhaUser, String confirmaSenha) {
        if (nomeUser != null) this.nomeUser = nomeUser;
        if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;
        if (confirmaSenha != null) this.confirmaSenha = confirmaSenha;
      
    }

    public UsuarioDto(String nomeUser, String emailUser, String senhaUser) {
        if (nomeUser != null) this.nomeUser = nomeUser;
        if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;
    }

    public UsuarioDto(UsuarioEntitys usuario){
        if(null != usuario){
            this.idUser = usuario.getIdUser().intValue();
            this.nomeUser = usuario.getNomeUser();
            this.emailUser = usuario.getEmailUser();
            this.senhaUser = usuario.getSenhaUser();
            this.confirmaSenha = usuario.getConfirmaSenha();
        }
    }
}


