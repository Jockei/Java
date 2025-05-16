package com.mycompany.aula16052025;

public abstract class Animal {
    public String nome;
    
    public Animal (String nome){
        this.nome = nome;
    }
    
    public void Dormir(){
        System.out.println("Dormindo");
    }
    
    public abstract void Comer();
    
}
