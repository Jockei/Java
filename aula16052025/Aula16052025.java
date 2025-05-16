package com.mycompany.aula16052025;

import java.util.ArrayList;
import java.util.List;

public class Aula16052025 {

    public static void main(String[] args) {
        System.out.println("ABSTRATO E INTERFACE");
        
        cachorro c1 = new cachorro("Bolinha");
        Hipopotamo h1 = new Hipopotamo("Motomoto");
        
        List<Animal> animais = new ArrayList<>();
        animais.add(c1);
        animais.add(h1);
        
        for(Animal a : animais){
            a.Dormir();
            a.Comer();
            if(a instanceof cachorro){
                ((cachorro)a).Brincar();
            }
        }
    }
}
