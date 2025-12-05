package com.example;

public class Euro extends Moeda {
    private final double valorConvercao = 6.18;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return getValor() * valorConvercao;
    }
}
