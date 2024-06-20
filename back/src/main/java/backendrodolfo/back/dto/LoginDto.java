package backendrodolfo.back.dto;

import backendrodolfo.back.entities.Login;

public class LoginDto {
    private String cpf;
    private String senha;

    public LoginDto(Login login) {
        this.cpf = login.getCpf();
        this.senha = login.getSenha();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
