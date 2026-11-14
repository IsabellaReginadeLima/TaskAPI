package br.edu.ifsp.web.service.exception;

public class RecursoNaoEncontradoException
        extends RuntimeException {

    public RecursoNaoEncontradoException(String msg) {
        super(msg);
    }
}