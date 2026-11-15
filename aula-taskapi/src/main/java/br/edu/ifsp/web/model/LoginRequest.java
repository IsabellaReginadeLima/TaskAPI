package br.edu.ifsp.web.model;
public class LoginRequest {

    private String email;
    private String credencialAcesso;

    public LoginRequest() {
    }

    public String getEmail() {
        return email;
    }

    public String getCredencialAcesso() {
        return credencialAcesso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCredencialAcesso(
            String credencialAcesso) {
        this.credencialAcesso =
                credencialAcesso;
    }
}