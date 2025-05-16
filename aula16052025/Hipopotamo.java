package com.mycompany.aula16052025;

public class Hipopotamo extends Animal {
    
    public Hipopotamo(String nome){
        super(nome);
    }
    
    @Override
    public void Comer(){
        System.out.println("Comendo Turista.");
    }
}
