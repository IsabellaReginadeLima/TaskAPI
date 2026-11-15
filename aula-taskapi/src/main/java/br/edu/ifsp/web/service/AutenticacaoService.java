package br.edu.ifsp.web.service;

import br.edu.ifsp.web.dao.UsuarioDAO;
import br.edu.ifsp.web.model.Usuario;
import br.edu.ifsp.web.service.exception.DadosInvalidosException;

public class AutenticacaoService implements IAutenticacaoService {

    private final UsuarioDAO usuarioDAO;

    public AutenticacaoService(
            UsuarioDAO usuarioDAO) {

        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public Usuario autenticar(
            String email,
            String credencialAcesso) {

        Usuario usuario =
                usuarioDAO.buscarPorEmail(email);

        if (usuario == null) {
            throw new DadosInvalidosException(
                    "Credenciais invalidas");
        }

        if (!usuario.getCredencialAcesso()
                .equals(credencialAcesso)) {

            throw new DadosInvalidosException(
                    "Credenciais inválidas");
        }

        return usuario;
    }
}