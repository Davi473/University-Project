package com.example;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return getValor();
    }
}
