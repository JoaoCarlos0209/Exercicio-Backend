package backendrodolfo.back.dto;

import backendrodolfo.back.entities.Cadastro;

public class CadastroDto {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String senha;
    private String cpf;
    private String cep;
    private String cidade;
    private String bairro;
    private String endereco;
    private String complemento;

    public CadastroDto(Cadastro cadastro) {
        this.cpf = cadastro.getCpf();
        this.nome = cadastro.getNome();
        this.sobrenome = cadastro.getSobrenome();
        this.email = cadastro.getEmail();
        this.telefone = cadastro.getTelefone();
        this.senha = cadastro.getSenha();
        this.cep = cadastro.getCep();
        this.cidade = cadastro.getCidade();
        this.bairro = cadastro.getBairro();
        this.endereco = cadastro.getEndereco();
        this.complemento = cadastro.getComplemento();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
