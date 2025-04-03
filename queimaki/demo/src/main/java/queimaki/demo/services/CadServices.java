package queimaki.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;
import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
import queimaki.demo.models.dtos.entitys.repos.UsuarioRepo;

import java.util.Optional;

@Service
public class CadServices {

    @Autowired
    private UsuarioRepo usuarioRepo;

    /*
     * Name: [ARF01] Create User
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

    }