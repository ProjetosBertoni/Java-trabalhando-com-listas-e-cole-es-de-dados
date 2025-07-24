package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;

public class DesafioStrings {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Felipe");
        listaStrings.add("Pedro");
        listaStrings.add("Roberto");
        listaStrings.add("Miguel");
        listaStrings.add("Rafael");

        for (String i : listaStrings){
            System.out.println(i);
        }
    }
}
