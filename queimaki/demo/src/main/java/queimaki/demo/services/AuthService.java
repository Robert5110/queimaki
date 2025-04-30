package queimaki.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import queimaki.demo.models.dtos.entitys.dtos.SignInDto;
import queimaki.demo.models.dtos.entitys.dtos.SignUpDto;
import queimaki.demo.models.dtos.entitys.entitys.UsuarioEntitys;
import queimaki.demo.models.dtos.entitys.repos.UsuarioRepo;
@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public Optional<String> signin(SignInDto signIn)
    {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                signIn.getNomeUserOrEmailUser(), 
                signIn.getSenhaUser()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return Optional.of("Login realizado com sucesso");
    }

    public Optional<String> signUp(SignUpDto signUp)
    {
        if(usuarioRepo.existsByNomeUser(signUp.getNomeUser())) return Optional.of("Nome de usuario já Existente");
        if(usuarioRepo.existsByEmailUser(signUp.getEmailUser())) return Optional.of("Email já Existente");

        UsuarioEntitys newUsuario = new UsuarioEntitys();
        newUsuario.setNomeUser(signUp.getNomeUser());
        newUsuario.setEmailUser(signUp.getEmailUser());
        newUsuario.setSenhaUser(passwordEncoder.encode(signUp.getSenhaUser()));

        try 
        {
            usuarioRepo.save(newUsuario);
            return Optional.of("Usuario cadastrado");
        }
        catch (Exception e)
        {
            throw new RuntimeException("Erro ao armazenar usuario", e);
        }
    }

}
