package loja;

public record Cupom(String codigo, int percentual) {

    public Cupom {
        if (percentual <= 0 || percentual > 50) {
            throw new IllegalArgumentException("Percentual do cupom invalido: " + percentual);
        }
    }
}
