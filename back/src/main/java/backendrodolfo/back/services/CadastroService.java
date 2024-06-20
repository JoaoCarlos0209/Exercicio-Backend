package backendrodolfo.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendrodolfo.back.entities.Cadastro;
import backendrodolfo.back.entities.Login;
import backendrodolfo.back.repository.CadastroRepository;
import backendrodolfo.back.repository.LoginRepository;

@Service
public class CadastroService {
    
    @Autowired
    CadastroRepository cadastroRepository;
    
    @Autowired
    LoginRepository loginRepository;

    public String cadastro(Cadastro cadastro) {
        cadastroRepository.save(cadastro);

        Login login = new Login();
        login.setCpf(cadastro.getCpf());
        login.setSenha(cadastro.getSenha());
        loginRepository.save(login);

        return "Cadastrado com sucesso!";
    }
}
