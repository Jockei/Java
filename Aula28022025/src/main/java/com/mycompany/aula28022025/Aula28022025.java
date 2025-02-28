package com.mycompany.aula28022025;

public class Aula28022025 {

    public static void main(String[] args) {
        System.out.println("Banco");
        
        Cliente_FODA c = new Cliente_FODA();
        c.cpf="1232165";
        c.nome = "Cásio";
        c.sobrenome = "Capucho";
        
        Conta_FODA cont = new Conta_FODA();
        cont.numero = 10;
        cont.limite = 100;
        cont.saldo = 10000;
        cont.titular = c;
        
        c.cont = cont;
        
        Cliente_FODA m = new Cliente_FODA();
        m.cpf="54654";
        m.nome = "Maria";
        m.sobrenome = "Silva";
        m.conjuge = c;
        c.conjuge = m;
        
        Conta_FODA contMaria = new Conta_FODA();
        cont.numero = 10;
        cont.limite = 100;
        cont.saldo = 500;
        cont.titular = m;
        
        m.cont = contMaria;
        
        c.conjuge.cont.limite = 1000;
        System.out.println(cont.limite);
        System.out.println(contMaria.limite);
        
    }
}
