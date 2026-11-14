package br.edu.ifsp.web.model;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String credencialAcesso;

    public Usuario() {
    }

    public Usuario(Integer id,
                   String nome,
                   String email,
                   String credencialAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.credencialAcesso = credencialAcesso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCredencialAcesso() {
        return credencialAcesso;
    }

    public void setCredencialAcesso(String credencialAcesso) {
        this.credencialAcesso = credencialAcesso;
    }
}