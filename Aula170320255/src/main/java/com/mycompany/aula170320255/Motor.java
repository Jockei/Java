package com.mycompany.aula170320255;

public class Motor {
    String potencia;
    String tipoCombustivel;
    Carro carro;
    
    public Motor(String potencia, String tipoCombustivel, Carro carro){
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.carro = carro;
        
        this.carro.motor = this;
    }
}