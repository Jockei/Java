package com.mycompany.aula170320255;

public class Aula170320255 {

    public static void main(String[] args) {
        Carro Carrosa = new Carro("Opala");
        Motor Mula = new Motor("171 hp", "Gas", Carrosa);
        Motorista Chofer = new Motorista("Duda", "123456789");
        
        Chofer.dirigir(Carrosa);
        
        System.out.println(Carrosa.modelo);
        System.out.println(Mula.potencia);
        System.out.println(Chofer.nome);
    }
}
