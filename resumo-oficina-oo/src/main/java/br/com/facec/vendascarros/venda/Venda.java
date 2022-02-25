package br.com.facec.vendascarros.venda;

import br.com.facec.vendascarros.carro.Carro;
import br.com.facec.vendascarros.cliente.Cliente;
import br.com.facec.vendascarros.cliente.Vendedor;
import br.com.facec.vendascarros.imprimir.Recibo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda implements Recibo {

    private final LocalDateTime dataHora = LocalDateTime.now();
    private final Cliente cliente;
    private Vendedor vendedor;
    private Carro carro;
    private BigDecimal valor;
    private StatusVenda status = StatusVenda.ABERTA;

    public Venda(Cliente cliente, Vendedor vendedor, Carro carro, BigDecimal valor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.valor = valor;
    }

    public void fecharVenda() {
        this.status = StatusVenda.FINALIZADA;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String conteudo() {
        return "-------- Venda de Carro --------" + "\n" +
                "Cliente: " + cliente.getNome() +
                " - CPF: " + cliente.getCpf() +
                "\n" +
                "Carro: " + carro.getMarca() +
                " modelo: " + carro.getModelo() +
                "\n" +
                "Vendedor: " + vendedor.getNome() +
                " - CPF: " + vendedor.getCpf() +
                "\n" +
                "Total: " + valor;
    }
}
