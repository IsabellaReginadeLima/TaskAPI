import br.edu.ifsp.web.dao.TarefaDAO;

public class TarefaService implements ITarefaService {

    private final TarefaDAO tarefaDAO;

    public TarefaService(
            TarefaDAO tarefaDAO) {

        this.tarefaDAO = tarefaDAO;
    }

    // implementar depois
}