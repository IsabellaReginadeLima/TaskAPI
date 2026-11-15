package br.edu.ifsp.web.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/tarefas/*")
public class FiltroAutenticacao implements Filter {

    @Override
    public void doFilter(
            ServletRequest req,
            ServletResponse resp,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request =
                (HttpServletRequest) req;

        HttpServletResponse response =
                (HttpServletResponse) resp;

        HttpSession session =
                request.getSession(false);

        if (session == null ||
                session.getAttribute("usuarioId") == null) {

            response.setStatus(
                    HttpServletResponse.SC_UNAUTHORIZED);

            response.setContentType(
                    "application/json");

            response.getWriter().write(
                    "{\"error\":\"Usuario nao autenticado\"}");

            return;
        }

        chain.doFilter(req, resp);
    }
}