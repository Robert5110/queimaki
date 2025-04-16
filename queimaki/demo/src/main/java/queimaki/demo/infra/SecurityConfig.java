package queimaki.demo.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /*
     * Name: [NF101] Security Configuration
     * Description: Configuration class for Spring Security
     * Author: Kevin da Costa Vinagre
    */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf(csrf -> csrf.disable()) // Desativa CSRF para simplificar testes
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/api/cad/test", "/api/cad/loginAdmin").permitAll() // Permite acesso público a esses endpoints
            .anyRequest().authenticated() // Exige autenticação para outros endpoints
        )
        .httpBasic(); // Usa autenticação básica
        return http.build();
    }
}