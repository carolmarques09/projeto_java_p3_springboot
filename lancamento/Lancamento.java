package lancamento;

import categoria.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import projeto.demo.pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Table(name = "lancamento")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String descricao;

    public LocalDate dataVencimento;

    public LocalDate dataPagamento;

    public BigDecimal valor;

    public String observacao;

    @Getter
    @Enumerated(EnumType.STRING)
    public TipoLancamento tipo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    public Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    public Pessoa pessoa;

    public Lancamento(DadosCadastroLancamento dados) {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}

// Pessoa -> Endereço (embedded)
// Lançamento -> categoria.Categoria (ManyToOne)
// Lançamento -> Pessoa (ManyToOne)
