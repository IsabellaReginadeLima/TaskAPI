package br.edu.ifsp.web.service.exception;

public class DadosInvalidosException
        extends RuntimeException {

    public DadosInvalidosException(String msg) {
        super(msg);
    }
}