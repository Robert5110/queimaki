package queimaki.demo.dtos;
import lombok.Data;

@Data
public class CadastroDto 
{

    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;

}