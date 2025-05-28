package lancamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    @Override
    public Lancamento salvar(DadosCadastroLancamento dados) {
        Lancamento novoLancamento = new Lancamento(dados);
        return repository.save(novoLancamento);
    }

    @Override
    public List<DadosListagemLancamento> listarTodos() {
        return repository.findAll().stream().map(DadosListagemLancamento::fromLancamento).toList();
    }

    @Override
    public Lancamento buscarPorId(Long id) {
        throw new UnsupportedOperationException("Método buscarPorId() não implementado."); // Placeholder
    }

    @Override
    public void atualizar(Long id, DadosAtualizacaoLancamento dados) {
        throw new UnsupportedOperationException("Método atualizar() não implementado.");
    }

    @Override
    public void excluir(Long id) {
        throw new UnsupportedOperationException("Método excluir() não implementado.");
    }

    @Override
    public List<Lancamento> listarPorTipo(TipoLancamento tipo) {
        throw new UnsupportedOperationException("Método listarPorTipo() não implementado."); // Placeholder
    }
}

