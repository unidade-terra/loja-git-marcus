package loja;

import java.math.BigDecimal;

public class Desconto {

    private static final BigDecimal CEM = new BigDecimal("100");

    public BigDecimal calcular(BigDecimal valor, int percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("Percentual negativo: " + percentual);
        }
        return valor.multiply(BigDecimal.valueOf(percentual)).divide(CEM);
    }
}
