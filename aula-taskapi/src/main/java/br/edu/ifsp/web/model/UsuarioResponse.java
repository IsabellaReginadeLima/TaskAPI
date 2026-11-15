package br.edu.ifsp.web.model;

public class UsuarioResponse {

    private int id;
    private String nome;
    private String email;

    public UsuarioResponse() {
    }

    public UsuarioResponse(
            int id,
            String nome,
            String email) {

        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}