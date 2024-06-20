package backendrodolfo.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backendrodolfo.back.entities.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository <Cadastro, Integer> {
    
}
