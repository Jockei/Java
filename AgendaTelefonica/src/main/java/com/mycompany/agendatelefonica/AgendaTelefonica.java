
package com.mycompany.agendatelefonica;

public class AgendaTelefonica {

    public static void main(String[] args) {
        Agenda a = new Agenda();
        
        a.inserir("João Gabriel Alvarenga", "27998965661");
        a.inserir("Jtão Gabriel Alvarea", "279965661");
        
        System.out.println(a.Quantidade());
        
        System.out.println(a.buscar("João Gabriel Alvarenga"));
        
        a.excluir("João Gabriel");
        
        System.out.println(a.buscar("Jtão"));
        
        a.imprimir();
    }
}
