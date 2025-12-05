package com.example;

import java.util.Scanner;

public class InitTerminal {
    private Scanner scanner = new Scanner(System.in);
    private Cofrinho cofrinho;

    public InitTerminal(Cofrinho cofrinho) {
        this.cofrinho = cofrinho;
        init();
    }

    private void init () {
        sair:
        while (true) { 
            System.out.println("======================");
            System.out.println("COFRINHO");
            System.out.println("======================");
            System.out.println("1-Adicionar Moeda");
            System.out.println("2-Remover Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para Real");
            System.out.println("0-Encerrar");
            System.out.println("======================");
            System.out.print("Opção: ");
            int valor = scanner.nextInt();
            switch (valor) {
                case 1 -> escolherMoeda();
                case 2 -> removerMoeda();
                case 3 -> { 
                    System.out.println("======================");
                    cofrinho.listagemMoedas();
                }
                case 4 -> {
                    System.out.println("======================");
                    cofrinho.totalConvertido();
                }
                case 0 -> { break sair; }
                default -> System.out.println("Valor Invalido.");
            }
        }
    }

    private void escolherMoeda() {
        System.out.println("======================");
        System.out.println("Escolha uma Moeda:");
        System.out.println("1-Real");
        System.out.println("2-Dolar");
        System.out.println("3-Euro");
        System.out.println("======================");
        System.out.print("Opção: ");
        int valor = scanner.nextInt();
        System.out.println("======================");
        System.out.print("Digite o valor: ");
        double valorMoeda = scanner.nextDouble();
        System.out.println("======================");
        Moeda novaMoeda = null;
        switch (valor) {
            case 1 -> novaMoeda = new Real(valorMoeda);
            case 2 -> novaMoeda = new Dolar(valorMoeda);
            case 3 -> novaMoeda = new Euro(valorMoeda);
            default -> System.out.println("Valor Invalido.");
        }
        if (novaMoeda !=  null) cofrinho.adicionar(novaMoeda);
    }

    private void removerMoeda() {
        System.out.println("======================");
        System.out.println("Escolha uma Moeda:");
        System.out.println("1-Real");
        System.out.println("2-Dolar");
        System.out.println("3-Euro");
        System.out.println("======================");
        System.out.print("Opção: ");
        int valor = scanner.nextInt();
        System.out.println("======================");
        System.out.print("Digite o valor: ");
        double valorMoeda = scanner.nextDouble();
        System.out.println("======================");
        Moeda novaMoeda = null;
        switch (valor) {
            case 1 -> novaMoeda = new Real(valorMoeda);
            case 2 -> novaMoeda = new Dolar(valorMoeda);
            case 3 -> novaMoeda = new Euro(valorMoeda);
            default -> System.out.println("Valor Invalido.");
        }
        if (novaMoeda !=  null) cofrinho.remover(novaMoeda);
    }
}
