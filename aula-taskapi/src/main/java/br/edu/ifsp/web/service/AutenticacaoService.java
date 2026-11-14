package br.edu.ifsp.web.service;

import br.edu.ifsp.web.dao.UsuarioDAO;
import br.edu.ifsp.web.model.Usuario;

public class AutenticacaoService
        implements IAutenticacaoService {

    private final UsuarioDAO usuarioDAO;

    public AutenticacaoService(
            UsuarioDAO usuarioDAO) {

        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public Usuario autenticar(
            String email,
            String credencial) {

        Usuario usuario =
                usuarioDAO.buscarPorEmail(email);

        if (usuario == null) {
            throw new RecursoNaoEncontradoException(
                    "Usuário não encontrado");
        }

        if (!usuario.getCredencialAcesso()
                .equals(credencial)) {

            throw new DadosInvalidosException(
                    "Credenciais inválidas");
        }

        return usuario;
    }
}