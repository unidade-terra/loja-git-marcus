package loja;

import java.math.BigDecimal;

public record Item(String nome, BigDecimal preco, int quantidade) {
}
