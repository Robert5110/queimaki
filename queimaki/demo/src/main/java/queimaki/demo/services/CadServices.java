package queimaki.demo.services;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import queimaki.demo.dtos.UsuarioInDto;
import queimaki.demo.entitys.entitys.UsuarioEntitys;
import queimaki.demo.entitys.repos.UsuarioRepo;

//Produtos




@Service
public class CadServices{

    @Autowired
    private UsuarioRepo usuarioRepo;

    

    /*
     * Name: [NF001] Create User
     * Description: Cadastra um novo usuário no sistema.
     * Author: Robert
     */
    public UsuarioEntitys createUsuario(UsuarioInDto usuario){
        // Se não existe, salva novo usuário. Se existe, retorna o existente.
        return (usuarioNaoExiste(usuario.getNomeUser(), usuario.getEmailUser()))
            ? usuarioRepo.save(new UsuarioEntitys(usuario))
            : usuarioRepo.findByNomeUserAndEmailUser(usuario.getNomeUser(), usuario.getEmailUser()).get();
    }

    /* 
     * Name: [NF002] Verifica se usuário NÃO existe
     * Description: Retorna true se não existe usuário com nome e email.
     * Author: Robert
     */
    public boolean usuarioNaoExiste(String nomeUser, String emailUser){
        return usuarioRepo.findByNomeUserAndEmailUser(nomeUser, emailUser).isEmpty();
    }
  



}









