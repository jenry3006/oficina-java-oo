package br.com.facec.vendascarros;

import br.com.facec.vendascarros.carro.Carro;
import br.com.facec.vendascarros.carro.Modelo;
import br.com.facec.vendascarros.cliente.Cliente;
import br.com.facec.vendascarros.cliente.Vendedor;
import br.com.facec.vendascarros.excecoes.AlteracaoInvalidaException;
import br.com.facec.vendascarros.imprimir.Impressao;
import br.com.facec.vendascarros.venda.Venda;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {


        Cliente joao = new Cliente("Joao", "4348488443");
        Vendedor jenry = new Vendedor("jenry ", "4354343");
        Carro s10 = new Carro(Modelo.S_10_FLEX, "2021/2021");
        Venda venda = new Venda(joao, jenry, s10, BigDecimal.valueOf(110_000));
        venda.fecharVenda();
        Impressao.imprimir(venda);

        System.out.println("-------------------------------------------------");

        Cliente Afonso = new Cliente("Afonso", "88877765432");
        Vendedor Jorge = new Vendedor("Jorge", "11100022209");
        Carro s10_diesel = new Carro(Modelo.S_10_DISEL, "2022/2022");
        Venda venda1 = new Venda(Afonso, Jorge,s10_diesel,BigDecimal.valueOf(100_000));
        venda.fecharVenda();
        Impressao.imprimir(venda1);

        System.out.println("-------------------------------------------------");

        Cliente diogo = new Cliente("Afonso", "88877765432");
        Vendedor jonas = new Vendedor("Jonas", "111354322209");
        Carro a3 = new Carro(Modelo.A3, "2022/2022");
        Venda venda2 = new Venda(diogo, jonas,a3,BigDecimal.valueOf(89_000));
        venda.fecharVenda();
        Impressao.imprimir(venda2);

        System.out.println("-------------------------------------------------");

        Cliente jeremias = new Cliente("Jeremias", "45277765432");
        Vendedor lucas = new Vendedor("Lucas", "87600022209");
        Carro mobi = new Carro(Modelo.MOBI, "2012/2013");
        Venda venda3 = new Venda(jeremias,lucas,mobi,BigDecimal.valueOf(56_000));
        venda.fecharVenda();
        Impressao.imprimir(venda3);

        System.out.println("-------------------------------------------------");

        Cliente john = new Cliente("John", "8523765432");
        Vendedor kaio = new Vendedor("Kaio", "11100324109");
        Carro corolla = new Carro(Modelo.COROLLA, "2016/2017");
        Venda venda4 = new Venda(john,kaio,corolla,BigDecimal.valueOf(70_000));
        venda.fecharVenda();
        Impressao.imprimir(venda4);

        System.out.println("-------------------------------------------------");

        Cliente jessica = new Cliente("Jessica", "852398432");
        Vendedor kaique = new Vendedor("Kaique", "1023194109");
        Carro gol = new Carro(Modelo.GOL, "2009/2010");
        Venda venda5 = new Venda(jessica,kaique,gol,BigDecimal.valueOf(25_000));
        venda.fecharVenda();
        Impressao.imprimir(venda5);












    }

}
