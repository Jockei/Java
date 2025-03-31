package com.mycompany.aula31032025;

public class Aula31032025 {

    public static void main(String[] args) {
        System.out.println("Agenda");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        
        ag.inserir("Casio", "12316514651");
        ag.inserir("Pedro", "23523524352");
        ag.inserir("Joao", "567567567567");
        ag.inserir("Maria", "0980980980");
        
        ag.imprimir();
    }
}
