package queimaki.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import queimaki.demo.services.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import queimaki.demo.dtos.ResponseModel;
import queimaki.demo.dtos.LoginDto;
import queimaki.demo.dtos.CadastroDto;

@RestController
@RequestMapping("/api/cad")
public class CadController{

    @Autowired
    private AuthService authService;

    /* Name: [RF000] Test
     * Description: Testa o funcionamento do sistema.
     * Author: Robert
    */

    @GetMapping("/test")
    public ResponseEntity<?> test() 
    {
        return ResponseEntity.status(200).body("Api esta funcional");
    }

    @PostMapping("/cadastro")
    public ResponseEntity<ResponseModel> signUpUser(@RequestBody CadastroDto Cadastro) 
    {
        ResponseModel responseDto = authService.cadastro(Cadastro);
        return ResponseEntity.status(responseDto.getStatus()).body(responseDto);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseModel> signInUser(@RequestBody LoginDto login)
    {           
        ResponseModel responseDto = authService.login(login);
        return ResponseEntity.status(responseDto.getStatus()).body(responseDto);
    }

}