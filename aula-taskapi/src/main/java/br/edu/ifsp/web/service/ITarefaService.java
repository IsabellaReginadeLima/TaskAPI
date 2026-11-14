package br.edu.ifsp.web.service;

import java.util.List;

import br.edu.ifsp.web.model.Tarefa;
import br.edu.ifsp.web.model.Usuario;

public interface ITarefaService {

    List<Tarefa> listar(Usuario usuario);

    Tarefa buscar(Integer id, Usuario usuario);

    Tarefa criar(Tarefa tarefa, Usuario usuario);

    Tarefa atualizar(
            Integer id,
            Tarefa tarefa,
            Usuario usuario);

    void concluir(
            Integer id,
            Usuario usuario);

    void excluir(
            Integer id,
            Usuario usuario);
}