package queimaki.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import queimaki.demo.dtos.ResponseModel;
import queimaki.demo.dtos.LoginDto;
import queimaki.demo.dtos.CadastroDto;
import queimaki.demo.entitys.entitys.UsuarioEntitys;
import queimaki.demo.repository.UserRepository;


@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Método para Logar o usuário
    public ResponseModel login(LoginDto login)
    {
        ResponseModel response = new ResponseModel();
        try
        {
            if(!userRepository.existsByName(login.getNomeUserOremailUser()) && !userRepository.existsByEmail(login.getNomeUserOremailUser())) {
                response.setMessage("Usuario ou Email não encontrado");
                response.setStatus(404);
                return response;
            }
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                      login.getNomeUserOremailUser(), 
                      login.getSenhaUser()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            response.setMessage("Login realizado com sucesso");
            response.setStatus(200);
            return response;

        }
        catch (Exception e)
        {
            response.setMessage("Erro ao logar usuario: " + e.getMessage());
            response.setStatus(500);
            return response;
        } 
    }

    public ResponseModel cadastro(CadastroDto cadastroDto)
    {
        ResponseModel response = new ResponseModel();
        try 
        {
            if(userRepository.existsByName(cadastroDto.getNomeUser()) || 
               userRepository.existsByEmail(cadastroDto.getEmailUser()))
            {
                response.setMessage("Usuario ou Email já cadastrado");
                response.setStatus(409);
                return response;
            }

            UsuarioEntitys newUser = new UsuarioEntitys();
            newUser.setNomeUser(cadastroDto.getNomeUser());
            newUser.setEmailUser(cadastroDto.getEmailUser());
            newUser.setSenhaUser(passwordEncoder.encode(cadastroDto.getSenhaUser()));
            userRepository.save(newUser);
            response.setMessage("Usuario cadastrado");
            response.setStatus(200);
            return response;
        }
        catch (Exception e)
        {
            response.setStatus(500);
            response.setMessage("Erro ao cadastrar usuario: " + e.getMessage());
            return response;
        }
    }

}

