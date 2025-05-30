package queimaki.demo.controllers;

//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.dtos.cadastroDto;
import com.demo.dtos.models.User;
import com.demo.repos.UsuarioRepo;



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
  */
  @PostMapping("/cadastro")
    public ResponseEntity<?> cadastroUser(@RequestBody cadastroDto cadastroUser) 
    {
        Optional<String> response = cadServices.cadastroUser(cadastroUser);

        return (response.get().equals("Usuario cadastrado"))
        ?ResponseEntity.status(202).body(response.get())
        :ResponseEntity.status(400).body(response.get());
    }

      @PostMapping("/login")
    public ResponseEntity<?> LoginUser(@RequestBody LoginDto Login)
    {
        Optional<String> response = authService.login(Login);

        return (response.get().equals("Login realizado com sucesso"))
        ?ResponseEntity.status(202).body(response.get())
        :ResponseEntity.status(400).body(response.get());
    }

  

}