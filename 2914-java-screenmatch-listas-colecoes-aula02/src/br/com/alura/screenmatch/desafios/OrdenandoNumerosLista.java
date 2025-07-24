package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoNumerosLista {

    public static void main(String[] args) {
        OrdenandoNumerosLista app = new OrdenandoNumerosLista();
        app.listarMaiorParaMenor();
        app.listarMenorParaMaior(); 


    }

    private void listarMaiorParaMenor(){
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(5);
        listaNumeros.add(3);
        listaNumeros.add(10);
        listaNumeros.add(4);
        listaNumeros.add(10);


        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("------------------");
        System.out.println(listaNumeros);
    }

    private void listarMenorParaMaior(){
        List<Integer> lista = new ArrayList<>();

        lista.add(7);
        lista.add(10);
        lista.add(8);
        lista.add(3);
        lista.add(20);

        Collections.sort(lista);
        System.out.println(lista);
    }

}
