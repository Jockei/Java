package com.mycompany.aula14022025;

import java.util.Scanner;

public class Aula14022025 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 5;
        int numero1;
        int numero2;
        while(opcao != 0){

        System.out.println("\t=========================");
        System.out.println("\t\tmenu!");
        System.out.println("\t=========================");
        System.out.println("\t(1) soma (+)");
        System.out.println("\t(2) subtração (-)");
        System.out.println("\t(3) multiplicação (*)");
        System.out.println("\t(4) divisão (/)");
        System.out.println("\t(0) sair");
        System.out.println("\t=========================");
        System.out.println("\tDigite a opção desejada: ");
        opcao = scan.nextInt();
        
                if (opcao == 0) {
            System.out.println("Saindo da calculadora...");
        } else if (opcao >= 1 && opcao <= 4) {
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        } else {
            System.out.println("Opção inválida! Digite um número entre 0 e 4.");
        }
                
        switch (opcao) {
            case 1 -> {
                System.out.println("Você escolheu SOMA");
                System.out.println("Digite o primeiro numero que vc deseja somar");
                numero1 = scan.nextInt();
                System.out.println("Digite o segundo numero que vc deseja somar");
                numero2 = scan.nextInt();
                System.out.println(somar(numero1,numero2));
                }
            
            case 2 -> {
                System.out.println("Você escolheu SUBTRAÇÂO");
                System.out.println("Digite o primeiro numero que vc deseja subtrair");
                numero1 = scan.nextInt();
                System.out.println("Digite o segundo numero que vc deseja subtrair");
                numero2 = scan.nextInt();
                System.out.println(subtracao(numero1,numero2));
                }
                        
            case 3 -> {
                System.out.println("Você escolheu MULTIPLICAÇÂO");
                System.out.println("Digite o primeiro numero que vc deseja multiplicar");
                numero1 = scan.nextInt();
                System.out.println("Digite o segundo numero que vc deseja multiplicar");
                numero2 = scan.nextInt();
                System.out.println(multiplicacao(numero1,numero2));
                }
            
            case 4 -> {
                System.out.println("Você escolheu DIVISÂO");
                System.out.println("Digite o primeiro numero que vc deseja dividir");
                numero1 = scan.nextInt();
                System.out.println("Digite o segundo numero que vc deseja dividir");
                numero2 = scan.nextInt();
                System.out.println(divisao(numero1,numero2));
                }
            
            case 0 -> System.out.println("Saindo...");
            default -> System.err.println("Opção Invalida!");
            }
        
        }
        
    }
    
    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static int subtracao(int a, int b) {
        return a - b;
    }
    
    public static double divisao(double a, double b) {
        return a / b;
    }
    
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
}