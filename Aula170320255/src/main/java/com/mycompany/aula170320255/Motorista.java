package com.mycompany.aula170320255;

public class Motorista {
    String nome;
    String cnh;
    Carro carro;
    public Motorista (String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }


    public void dirigir(Carro a){
        if (a.motor != null){
            a.motorista = this;
            System.out.println("O/A motorista: " + nome);
            System.out.println("Está dirigindo o carro: " + a.modelo);
        } else{
            System.out.println("Esse carro não tem um motor");
        }
    }
}