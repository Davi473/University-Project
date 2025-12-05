package com.example;

public class Dolar extends Moeda {
    private final double valorConvercao = 5.3;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return getValor() * valorConvercao;
    }
}
