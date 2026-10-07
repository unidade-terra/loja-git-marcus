package loja;

import java.math.BigDecimal;

public class Frete {

    private static final BigDecimal FRETE_SUL = new BigDecimal("15.00");
    private static final BigDecimal FRETE_PADRAO = new BigDecimal("25.00");

    public BigDecimal calcular(String cep) {
        return cep.startsWith("9") ? FRETE_SUL : FRETE_PADRAO;
    }
}
