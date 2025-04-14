package queimaki.demo.models.dtos.entitys.entitys;

import java.io.Serializable;

import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class UsuarioEntitys implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "nome_user", nullable = false) 
    private String nomeUser; 

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "senha_user") 
    private String senhaUser; 

    @Column(name = "confirma_senha") 
    private String confirmaSenha; 


    public UsuarioEntitys() {
    }

    public UsuarioEntitys(Long idUser ,String nomeUser, String emailUser, String senhaUser, String confirmaSenha) {
        if (idUser != null) this.idUser = idUser;
        if (nomeUser != null) this.nomeUser = nomeUser;
        if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;
        if (confirmaSenha != null) this.confirmaSenha = confirmaSenha;
        
    }

    public UsuarioEntitys(String nomeUser, String emailUser, String senhaUser, String confirmaSenha){
        if (nomeUser != null) this.nomeUser = nomeUser;
        if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;  
        if (confirmaSenha != null) this.confirmaSenha = confirmaSenha;
    }

    public UsuarioEntitys(String nomeUser, String emailUser, String senhaUser) {
        if (nomeUser != null) this.nomeUser = nomeUser;
        if (emailUser != null) this.emailUser = emailUser;
        if (senhaUser != null) this.senhaUser = senhaUser;
    }

    public UsuarioEntitys(UsuarioInDto usuario){
        this.nomeUser = usuario.getNomeUser();
        this.emailUser = usuario.getEmailUser();
        this.senhaUser = usuario.getSenhaUser();
        this.confirmaSenha = usuario.getConfirmaSenha();
    }
}
