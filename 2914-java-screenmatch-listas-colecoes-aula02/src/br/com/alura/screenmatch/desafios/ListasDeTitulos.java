package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasDeTitulos {
    public static void main(String[] args) {
        List<Titulos> lista = new ArrayList<>();

        lista.add(new Titulos("Pedro"));
        lista.add(new Titulos("Roberto"));
        lista.add(new Titulos("Felipe"));

        Collections.sort(lista);
        for (Titulos titulos : lista){
            System.out.println(titulos);
        }
    }
}
