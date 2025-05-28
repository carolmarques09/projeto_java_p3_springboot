package lancamento;

import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosCadastroLancamento(
        @NotNull
        Long id,
        @NotNull
        String descricao,
        LocalDate dataVencimento,
        LocalDate dataPagamento,
        @NotNull
        BigDecimal valor,
        String observacao) {
}
