package queimaki.demo.models.dtos.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "users", uniqueConstraints = 
            {
        @UniqueConstraint(columnNames = "nome"),
        @UniqueConstraint(columnNames = "email")
            }
        )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 255)
    private String nome;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "senha", nullable = false, columnDefinition = "TEXT")
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    public User()
    {
        this.role = Role.USER;
    }

}