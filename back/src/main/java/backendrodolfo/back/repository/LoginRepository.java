package backendrodolfo.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backendrodolfo.back.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{
    Login findByCpf(String cpf);
}
