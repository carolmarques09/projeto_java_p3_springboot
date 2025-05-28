package projeto.demo.pessoa;

import endereco.Endereco;
import endereco.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public record DadosCadastroPessoa(
        @NotBlank
        String nome,
        @NotNull Endereco endereco,
        Long id) {
}
