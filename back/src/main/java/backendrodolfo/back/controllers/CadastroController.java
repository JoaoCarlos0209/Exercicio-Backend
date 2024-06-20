package backendrodolfo.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backendrodolfo.back.entities.Cadastro;
import backendrodolfo.back.services.CadastroService;

@RestController
@RequestMapping("/usuario")
public class CadastroController {
    
    @Autowired
    CadastroService service;


    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastro(Cadastro cadastro){
        return new ResponseEntity<>(service.cadastro(cadastro), HttpStatus.OK);
    }
}
