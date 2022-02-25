package br.com.facec.vendascarros.carro;

public enum Modelo {

    S_10_FLEX(Marca.CHEVROLET),
    S_10_DISEL(Marca.CHEVROLET),
    GOL(Marca.VOLKSWAGEN),
    A3(Marca.AUDI),
    COROLLA(Marca.TOYOTA),
    MOBI(Marca.FIAT);

    private final Marca marca;

    Modelo(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }
}
