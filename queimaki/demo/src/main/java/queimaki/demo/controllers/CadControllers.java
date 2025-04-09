package queimaki.demo.controllers;

import java.util.Optional;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

import queimaki.demo.models.dtos.entitys.dtos.ProdutosInDto;
import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;
import queimaki.demo.services.CadServices;
import queimaki.demo.models.dtos.entitys.dtos.ProdutosDto;
import queimaki.demo.models.dtos.entitys.dtos.UsuarioDto;
import queimaki.demo.models.dtos.entitys.dtos.LoginDto;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/cad")
public class CadControllers {

    @Autowired
    private CadServices cadServices;
    
    /* Name: [RF000] Test
     * Description: Testa o funcionamento do sistema.
     * Author: Robert
    */
    @GetMapping("/test")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Tudo certo");
    }


    /*Name: [RF001] Create User
    * Description: Cadastra um novo usuário no sistema.
    Author: Robert
     */
    @PostMapping("/createUser")
    public ResponseEntity<UsuarioDto> createUser(@RequestBody UsuarioInDto usuario) {
        UsuarioDto usuarioDto = new UsuarioDto(usuario.getNomeUser(), usuario.getEmailUser(), usuario.getSenhaUser(), usuario.getConfirmaSenha());
        return ResponseEntity.ok(cadServices.createUsuarios(usuario));
    }

}

