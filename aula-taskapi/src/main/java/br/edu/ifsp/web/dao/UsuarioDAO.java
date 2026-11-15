package br.edu.ifsp.web.dao;

import java.sql.Connection;

import br.edu.ifsp.web.model.Usuario;

public class UsuarioDAO {

    private final Connection conexao;

    public UsuarioDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public Usuario buscarPorEmail(String email) {
        // SELECT * FROM usuarios WHERE email = ?
    }

    public Usuario buscarPorId(int id) {
        // SELECT * FROM usuarios WHERE id = ?
    }
}