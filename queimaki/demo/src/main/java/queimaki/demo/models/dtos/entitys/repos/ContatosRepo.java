package queimaki.demo.models.dtos.entitys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import queimaki.demo.models.dtos.entitys.Contatos;
import queimaki.demo.models.dtos.entitys.ContatosId;

@Repository
public interface ContatosRepo extends JpaRepository<Contatos, ContatosId> {
    
}