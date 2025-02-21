package com.mycompany.aula14022025;

import java.util.Scanner;

public class Aula14022025 {
    
    public static void menu(){
        for(int i = 0; i < 10; i++){
                System.out.println(" ");
            }

        System.out.println("\t========================");
        System.out.println("\t\t menu!");
        System.out.println("\t========================");
        System.out.println("\t(1) soma (+)");
        System.out.println("\t(2) subtração (-)");
        System.out.println("\t(3) multiplicação (*)");
        System.out.println("\t(4) divisão (/)");
        System.out.println("\t(0) sair");
        System.out.println("\t========================");
        System.out.print("\tDigite a opção desejada: ");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int opcao;
        int numero1;
        int numero2;
        do {
            
            menu();
            opcao = scan.nextInt();
            System.out.println(" ");
        
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
                    System.out.print("Digite o primeiro numero que vc deseja somar: ");
                    numero1 = scan.nextInt();
                    System.out.print("Digite o segundo numero que vc deseja somar: ");
                    numero2 = scan.nextInt();
                    System.out.println("Resultado: "+Calc.somar(numero1,numero2));
                }

                case 2 -> {
                    System.out.println("Você escolheu SUBTRAÇÂO");
                    System.out.print("Digite o primeiro numero que vc deseja subtrair: ");
                    numero1 = scan.nextInt();
                    System.out.print("Digite o segundo numero que vc deseja subtrair: ");
                    numero2 = scan.nextInt();
                    System.out.println("Resultado: "+Calc.subtracao(numero1,numero2));
                }

                case 3 -> {
                    System.out.println("Você escolheu MULTIPLICAÇÂO");
                    System.out.print("Digite o primeiro numero que vc deseja multiplicar: ");
                    numero1 = scan.nextInt();
                    System.out.print("Digite o segundo numero que vc deseja multiplicar: ");
                    numero2 = scan.nextInt();
                    System.out.println("Resultado: "+Calc.multiplicacao(numero1,numero2));
                }

                case 4 -> {
                    System.out.println("Você escolheu DIVISÂO");
                    System.out.print("Digite o primeiro numero que vc deseja dividir: ");
                    numero1 = scan.nextInt();
                    System.out.print("Digite o segundo numero que vc deseja dividir: ");
                    numero2 = scan.nextInt();
                    System.out.println("Resultado: "+Calc.divisao(numero1,numero2));
                }

                case 0 -> {
                    for(int i = 0; i < 10; i++){
                        System.out.println(" ");
                    }
                    System.out.println("Saindo...");
                }
                default -> System.err.println("Opção Invalida!");
            }
            Thread.sleep(3000);
        }
        while(opcao != 0);
    }
}