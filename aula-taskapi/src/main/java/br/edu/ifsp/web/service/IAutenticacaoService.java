package br.edu.ifsp.web.service;

import br.edu.ifsp.web.model.Usuario;

public interface IAutenticacaoService {

    Usuario autenticar(
            String email,
            String credencialAcesso);
}