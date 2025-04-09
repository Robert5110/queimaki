package queimaki.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Usuario
import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;
import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
import queimaki.demo.models.dtos.entitys.repos.UsuarioRepo;

//Produtos




@Service
public class CadServices {

    @Autowired
    private UsuarioRepo usuarioRepo;

    

    /*
     * Name: [NF001] Create User
     * Description: Cadastra um novo usuário no sistema.
     * Author: Robert
     */
    public UsuarioEntitys createUsuarios(UsuarioInDto usuario){

      UsuarioEntitys usuarioEntitys = new UsuarioEntitys(usuario.getNomeUser(),
         usuario.getEmailUser(),
          usuario.getSenhaUser(),  
           usuario.getConfirmaSenha());
        return usuarioRepo.save(usuarioEntitys);
    }

    

    /* 
     * Name: [NF002] Update User
     * Description: Atualiza os dados de um usuário existente no sistema.
     * Author: Robert
     */
    public UsuarioEntitys updateUsuarios(UsuarioInDto usuario){

        UsuarioEntitys usuarioEntitys = new UsuarioEntitys(usuario.getNomeUser(),
            usuario.getEmailUser(),
            usuario.getSenhaUser(),  
            usuario.getConfirmaSenha());
        return usuarioRepo.save(usuarioEntitys);
    }

    /*
     * Name: [NF003] Delete User
     * Description: Remove um usuário do sistema.
     * Author: Robert
     */
    public void deleteUsuarios(UsuarioInDto usuario){

        UsuarioEntitys usuarioEntitys = new UsuarioEntitys(usuario.getNomeUser(),
            usuario.getEmailUser(),
            usuario.getSenhaUser(),  
            usuario.getConfirmaSenha());
        usuarioRepo.delete(usuarioEntitys);
  }











// Login de Administrador

   public Optional<String>LoginAdmin(UsuarioInDto usuario) {
    String email = usuario.getEmailUser();
    String senha = usuario.getSenhaUser();

    Optional<UsuarioEntitys> usuarioOptional = usuarioRepo.findByEmailUserAndSenhaUser(email, senha);

    if (usuarioOptional.isPresent()) {
        return Optional.of("Login realizado com sucesso!");
    } else {
        return Optional.empty();
    }
}

// Login de Usuário

public Optional<String>LoginUser(UsuarioInDto usuario) {
    String email = usuario.getEmailUser();
    String senha = usuario.getSenhaUser();

    Optional<UsuarioEntitys> usuarioOptional = usuarioRepo.findByEmailUserAndSenhaUser(email, senha);

    if (usuarioOptional.isPresent()) {
        return Optional.of("Login realizado com sucesso!");
    } else {
        return Optional.empty();
    }
}
}
