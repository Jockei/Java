package com.mycompany.aula16052025;

public class cachorro extends Canino implements pet{
    
    public cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void Comer(){
        System.out.println("Comendo ração.");
    }
    
    @Override
    public void Brincar(){
        System.out.println("Brincando");
    }
}
