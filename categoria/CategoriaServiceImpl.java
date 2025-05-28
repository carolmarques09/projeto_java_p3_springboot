package categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Override
    public Categoria salvar(DadosCadastroCategoria dados) {
        Categoria categoria = new Categoria(dados);
        return repository.save(categoria);
    }

    @Override
    public List<DadosListagemCategoria> listarTodos() {
        return repository.findAll().stream().map(DadosListagemCategoria::new).toList();
    }

    @Override
    public Categoria buscarPorId(Long id) {
        throw new UnsupportedOperationException("Método buscarPorId() não implementado!");
    }

    @Override
    public void atualizar(Long id, DadosAtualizacaoCategoria dados) {
        throw new UnsupportedOperationException("Método atualizar() não implementado!");
    }

    @Override
    public void excluir(Long id) {
        throw new UnsupportedOperationException("Método excluir() não implementado!");
    }
}
