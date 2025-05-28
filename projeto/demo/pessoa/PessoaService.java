package projeto.demo.pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    List<Pessoa> listarTodas();
    Optional<Pessoa> buscarPorId(Long id);
    Pessoa salvar(Pessoa pessoa);
    void deletar(Long id);
    Pessoa atualizar(Long id, Pessoa pessoa);
    void atualizarPropriedadeAtivo(Long id, Boolean ativo);
}