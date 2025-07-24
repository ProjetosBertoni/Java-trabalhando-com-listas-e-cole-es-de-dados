package br.com.alura.screenmatch.desafiofinalcurso;

public class Compras implements Comparable<Compras> {
    private String nome;
    private int valor;

    public Compras(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compras outra) {
        return Integer.compare(this.valor, outra.valor); // ordena por valor
    }

    @Override
    public String toString() {
        return nome + " - R$ " + valor;
    }
}
