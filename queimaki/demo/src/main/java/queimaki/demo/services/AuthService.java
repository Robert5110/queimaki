package queimaki.demo.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.dtos.cadastradoDto;
import com.demo.dtos.LoginDto;
import com.api.api.models.User;
import com.api.api.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public Optional<String> login(LoginDto login)
    {
        Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            signIn.getUserOrEmail(), 
            signIn.getSenha()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        System.out.println(authentication);
        return Optional.of("Login realizado com sucesso");
    }

    public Optional<String> cadastro(cadastroDto cadastro)
    {
        try 
        {
            if(userRepo.existsByNome(signUp.getNome())) return Optional.of("Nome de usuario já Existente");
            if(userRepo.existsByEmail(signUp.getEmail())) return Optional.of("Email já Existente");

            User newUser = new User();
            newUser.setNome(signUp.getNome());
            newUser.setEmail(signUp.getEmail());
            newUser.setSenha(passwordEncoder.encode(signUp.getSenha()));

            userRepo.save(newUser);
            return Optional.of("Usuario cadastrado");
        }
        catch (Exception e)
        {
            throw new RuntimeException("Erro ao armazenar usuario", e);
        }
    }

}