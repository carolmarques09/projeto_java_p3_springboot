package lancamento;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    Lancamento save(Lancamento novoLancamento);

    @Override
    List<Lancamento> findAll();
}
