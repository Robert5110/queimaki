package queimaki.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import queimaki.demo.models.dtos.entitys.dtos.SignUpDto;
import queimaki.demo.services.AuthService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
        return ResponseEntity.status(202).body("API funcionando corretamente!");
    }
     /*
     * Name: [RF0021] Signup usuario
     * Description: Method to create a new usuario
     * Author: 
    */
@PostMapping("/signup")
    public ResponseEntity<?> postMethodName(@RequestBody SignUpDto signup) 
    {
        Optional<String> response = authService.signUp(signup);

        return (response.get().equals("Usuario cadastrado"))
        ?ResponseEntity.status(202).body(response.get())
        :ResponseEntity.status(400).body(response.get());
    }

  
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