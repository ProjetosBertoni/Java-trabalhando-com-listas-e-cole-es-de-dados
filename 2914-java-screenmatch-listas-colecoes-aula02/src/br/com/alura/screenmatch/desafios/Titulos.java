package br.com.alura.screenmatch.desafios;

public class Titulos implements Comparable<Titulos> {
    String nome;

    public Titulos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulos o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Titulos{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
