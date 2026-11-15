package br.edu.ifsp.web.servlet;

import br.edu.ifsp.web.model.*;
import br.edu.ifsp.web.model.Usuario;
import br.edu.ifsp.web.service.IAutenticacaoService;
import br.edu.ifsp.web.service.exception.DadosInvalidosException;
import com.google.gson.Gson;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {

    private final Gson gson = new Gson();

    private IAutenticacaoService authService;

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        try {

            LoginRequest login =
                    gson.fromJson(
                            req.getReader(),
                            LoginRequest.class);

            Usuario usuario =
                    authService.autenticar(
                            login.getEmail(),
                            login.getCredencialAcesso());

            req.changeSessionId();

            HttpSession sessao =
                    req.getSession(true);

            sessao.setAttribute(
                    "usuarioId",
                    usuario.getId());

            UsuarioResponse resposta =
                    new UsuarioResponse(
                            usuario.getId(),
                            usuario.getNome(),
                            usuario.getEmail());

            resp.setStatus(200);
            resp.setContentType(
                    "application/json");

            gson.toJson(
                    resposta,
                    resp.getWriter());

        } catch (DadosInvalidosException ex) {

            resp.setStatus(401);

            resp.getWriter().write(
                    "{\"error\":\"Credenciais inválidas\"}");
        }
    }
}