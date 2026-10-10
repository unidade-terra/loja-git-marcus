package loja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<Item> itens = new ArrayList<>();
    private Cupom cupom;

    public void adicionar(Item item) {
        itens.add(item);
    }

    public void remover(String nome) {
        itens.removeIf(i -> i.nome().equals(nome));
    }

    public void aplicarCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public BigDecimal total() {
        BigDecimal bruto = itens.stream()
                .map(i -> i.preco().multiply(BigDecimal.valueOf(i.quantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        if (cupom == null) {
            return bruto;
        }
        return bruto.subtract(new Desconto().calcular(bruto, cupom.percentual()));
    }
}
