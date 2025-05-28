package endereco;

import org.hibernate.annotations.processing.Pattern;

public record DadosEndereco(
    @NotBlank
    String logradouro,
    @NotBlank
    String bairro,
    @NotBlank
    // @Pattern(regexp = "\\d{8}")
    Integer cep,
    @NotBlank
    String cidade,
    @NotBlank
    Integer complemento,
    Integer numero,
    String estado) {
}
