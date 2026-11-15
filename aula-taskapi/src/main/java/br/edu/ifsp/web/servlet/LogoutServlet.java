package br.edu.ifsp.web.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/auth/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {

        HttpSession sessao =
                req.getSession(false);

        if (sessao != null) {
            sessao.invalidate();
        }

        resp.setStatus(204);
    }
}