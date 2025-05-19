package com.mycompany.aula190520025;

public abstract class Conta {
    private double saldo;
    
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void Depositar(double valor){
        saldo += valor;
    }
    
    public abstract void Sacar(double valor);

    
    public abstract void aplicarRendimento();

    
    public String tipoConta(){
        return("Conta Generica");
    }
}