package com.mycompany.aula14022025;

import java.util.Scanner;

public class Aula14022025 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao;
        
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
        System.out.printf("A opção selecinada foi: %d \n", opcao);
    }
}