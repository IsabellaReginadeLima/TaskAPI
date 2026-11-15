package br.edu.ifsp.web.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class ListenerSessao
        implements HttpSessionListener {

    private static int sessoesAtivas = 0;

    @Override
    public void sessionCreated(
            HttpSessionEvent se) {

        synchronized (ListenerSessao.class) {
            sessoesAtivas++;
        }
    }

    @Override
    public void sessionDestroyed(
            HttpSessionEvent se) {

        synchronized (ListenerSessao.class) {
            sessoesAtivas--;
        }
    }

    public static int getSessoesAtivas() {
        return sessoesAtivas;
    }
}