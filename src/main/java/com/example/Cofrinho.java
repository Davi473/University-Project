package com.example;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda novaMoeda) {
        listaMoedas.add(novaMoeda);
    }

    public void remover(Moeda removerMoeda) {
        boolean removido = listaMoedas.remove(removerMoeda);

        if (removido) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada!");
        }
    }

    public void listagemMoedas() {
        listaMoedas.forEach(moeda ->
            System.out.println(moeda.getClass().getSimpleName() + ": " + moeda.getValor())
        );
    }

    public void totalConvertido() {
        double totalReal = listaMoedas.stream()
            .mapToDouble(Moeda::converter)
            .sum();

        System.out.printf("Total em real: %.2f%n", totalReal);
    }
}

