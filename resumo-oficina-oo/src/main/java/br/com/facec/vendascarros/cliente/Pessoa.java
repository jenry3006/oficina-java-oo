package br.com.facec.vendascarros.cliente;

public abstract class Pessoa {

    private final String nome;
    private final String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
