package loja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public BigDecimal total() {
        return itens.stream()
                .map(i -> i.preco().multiply(BigDecimal.valueOf(i.quantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
