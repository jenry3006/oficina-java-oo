package br.com.facec.vendascarros.carro;

import br.com.facec.vendascarros.excecoes.AlteracaoInvalidaException;

public class Carro {

    private final Modelo modelo;
    private final String ano;
    private String placa;

    public Carro(final Modelo modelo, final String ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(final Modelo modelo, final String ano, final String placa) {
        this(modelo, ano);
        this.placa = placa;
    }

    public Marca getMarca() {
        return modelo == null ? null : modelo.getMarca();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        if (this.placa != null) {
            throw new AlteracaoInvalidaException("A placa do carro não pode ser alterada!");
        }

        this.placa = placa;
    }
}
