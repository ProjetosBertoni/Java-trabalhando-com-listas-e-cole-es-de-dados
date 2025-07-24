package br.com.alura.screenmatch.desafiofinalcurso;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o limite do cartão?");
        int limite = scanner.nextInt();
        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int parar = 0;

        while (parar == 0) {
            System.out.println("O que deseja comprar?");
            String nome = scanner.next();

            System.out.println("Qual o valor do produto?");
            int valor = scanner.nextInt();

            Compras compra = new Compras(nome, valor);

            boolean compraAprovada = cartaoCredito.aprovarCompra(compra);
            if (compraAprovada) {
                cartaoCredito.adicionarCompra(compra);
                System.out.println("Compra aprovada!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.println("Deseja continuar comprando? Digite 0 (para sim) ou qualquer outro número (para sair)");
            parar = scanner.nextInt();
        }

        Collections.sort(cartaoCredito.getCompras());
        System.out.println("\nCompras realizadas:");
        for (Compras c : cartaoCredito.getCompras()) {
            System.out.println(c);
        }

        System.out.println("Saldo restante: R$" + cartaoCredito.getLimite());
    }
}

