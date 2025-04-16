package queimaki.demo.controllers;

//import java.util.Optional;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import queimaki.demo.models.dtos.entitys.dtos.LoginDto;

//import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;
//import queimaki.demo.models.dtos.entitys.repos.UsuarioRepo;
//import queimaki.demo.models.dtos.entitys.dtos.UsuarioInDto;
//import queimaki.demo.models.dtos.entitys.dtos.UsuarioDto;
//import queimaki.demo.services.CadServices;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/cad")
public class CadController{

   


   
    /* Name: [RF000] Test
     * Description: Testa o funcionamento do sistema.
     * Author: Robert
    */
    @GetMapping("/test")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Tudo certo!");
    }  
     /*
     * Name: [RF0021] Signup usuario
     * Description: Method to create a new usuario
     * Author: 
    
       @PostMapping("/signupUsuario")
    public ResponseEntity SignupUsuario(@RequestBody UsuarioInDto usuario ) {
        Optional<UsuarioDto> newVisitor = cadServices.createUsuario(usuario);
        return (newVisitor.isEmpty())
        ?ResponseEntity.status(404).body("Usuario existente")
        :ResponseEntity.status(202).body(newVisitor.get());
        
    }
*/
  
   /* 
    @PostMapping("/loginAdmin")
    public ResponseEntity postMethodName(@RequestBody LoginDto log) {
        String response = cadServices.loginAdmin(log).get();
        return (response.equals("Login realizado com sucesso"))
        ?ResponseEntity.status(202).body(response)
        :ResponseEntity.status(404).body(response);
    }
    

}
*/



}