package br.com.alura.screenmatch.desafiofinalcurso;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private int limite;
    private List<Compras> compras;

    public CartaoCredito(int limite) {
        this.limite = limite;
        this.compras = new ArrayList<>();
    }

    public boolean aprovarCompra(Compras compra) {
        if (compra.getValor() <= limite) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionarCompra(Compras compra) {
        compras.add(compra);
        limite -= compra.getValor();
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public int getLimite() {
        return limite;
    }
}
