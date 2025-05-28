package categoria;

import java.util.List;

public interface CategoriaService {
    Categoria salvar(DadosCadastroCategoria dados);
    List<DadosListagemCategoria> listarTodos();
    Categoria buscarPorId(Long id);
    void atualizar(Long id, DadosAtualizacaoCategoria dados);
    void excluir(Long id);
}
