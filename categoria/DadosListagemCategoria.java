package categoria;

public record DadosListagemCategoria(Long id, String nome, String descricao) {
    public DadosListagemCategoria(Categoria categoria) {
        this(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }
}
