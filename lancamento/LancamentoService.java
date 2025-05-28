package lancamento;

import java.util.List;
import java.util.logging.LogManager;

public interface LancamentoService {
    Lancamento salvar(DadosCadastroLancamento dados);
    List<DadosListagemLancamento> listarTodos();
    Lancamento buscarPorId(Long id);
    void atualizar(Long id, DadosAtualizacaoLancamento dados);
    void excluir(Long id);
    List<Lancamento> listarPorTipo(TipoLancamento tipo);

}
