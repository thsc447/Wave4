package POO_I.classI.integrationII.entities;

import java.math.BigDecimal;

public class Produtos {
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

    public Produtos(String nome, BigDecimal preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produtos: " +
                " nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade
                ;
    }
}
