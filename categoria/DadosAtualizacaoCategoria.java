package categoria;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosAtualizacaoCategoria(
        @NotNull
        Long id,
        String nome,
        String descricao) {
}