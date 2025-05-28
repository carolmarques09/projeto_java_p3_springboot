package lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosListagemLancamento(Long id, String descricao, LocalDate dataVencimento, LocalDate dataPagamento, BigDecimal valor, String observacao) {
    // Construtor adicional para chamar o construtor principal
    public static DadosListagemLancamento fromLancamento(Lancamento lancamento) {
        return new DadosListagemLancamento(
                lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getDataVencimento(),
                lancamento.getDataPagamento(),
                lancamento.getValor(),
                lancamento.getObservacao()
        );
    }
}
