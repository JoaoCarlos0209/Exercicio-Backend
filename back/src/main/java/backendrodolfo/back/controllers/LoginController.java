package backendrodolfo.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backendrodolfo.back.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    LoginService service;
    
    @PostMapping
    public ResponseEntity<String> login(String cpf, String senha){
        return (service.login(cpf, senha));
    }
}
