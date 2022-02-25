package br.com.facec.vendascarros.imprimir;

public final class Impressao {

    public static void imprimir(final Recibo recibo) {
        System.out.println(recibo.conteudo());
    }

}
