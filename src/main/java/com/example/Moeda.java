package com.example;

public abstract class Moeda {
    private double valor;

    public Moeda() {}

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void info() {
        System.out.println(valor);
    };

    public abstract double converter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Moeda moeda = (Moeda) obj;

        return Double.compare(moeda.valor, this.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }
}
