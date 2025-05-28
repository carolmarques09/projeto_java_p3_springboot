package categoria;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosCadastroCategoria(
        @NotNull
        Long id,
        String nome,
        String descricao) {
}