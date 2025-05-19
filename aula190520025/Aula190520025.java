package com.mycompany.aula190520025;

public class Aula190520025 {

    public static void main(String[] args) {
        
        System.out.println("Exemplo Contas");
        
        Cliente cli = new Cliente("Cassio", "000000000000");
        
        cli.CriarConta(100, 1);
        cli.CriarConta(200, 1);
        cli.CriarConta(300, 2);
        cli.CriarConta(400, 2);
        
        cli.MostrarSaldos();
        
        for(Conta c : cli.getContas()){
            c.aplicarRendimento();
        }
        
        cli.MostrarSaldos();
    }
}
