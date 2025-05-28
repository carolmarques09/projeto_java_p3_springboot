package lancamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoRepository repository;
    private DadosCadastroLancamento dados;

    private final LancamentoService service;

    public LancamentoController(LancamentoService service) {
        this.service = service;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoLancamento> cadastrar(@RequestBody DadosCadastroLancamento dados, UriComponentsBuilder uriBuilder) {
        Lancamento lancamento = service.salvar(dados);

        URI uri = uriBuilder.path("/lancamento/{id}").buildAndExpand(lancamento.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoLancamento(lancamento));
    }

    @GetMapping
    public List<DadosListagemLancamento> listar() {
        return service.listarTodos();
    }

    @GetMapping("tipo/{tipo}")
    public List<Lancamento> listarPorTipo(@PathVariable TipoLancamento tipo) {
        return service.listarPorTipo(tipo);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody DadosAtualizacaoLancamento dados) {
        service.atualizar(id, dados);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
