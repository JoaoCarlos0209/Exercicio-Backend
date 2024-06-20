package backendrodolfo.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import backendrodolfo.back.entities.Login;
import backendrodolfo.back.repository.LoginRepository;

@Service
public class LoginService {
    
    @Autowired
    LoginRepository repository;

    public ResponseEntity<String> login(String cpf, String senha) {
        Login usuario = repository.findByCpf(cpf);

        if (usuario == null) {
            return new ResponseEntity<>("Usuario ou senha incorretos", HttpStatus.NOT_FOUND);
        }

        if (usuario.getSenha().equals(senha)) {
            return new ResponseEntity<>("Login efetuado com sucesso!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Usuario ou senha incorretos", HttpStatus.NOT_FOUND);
        }
    }
}