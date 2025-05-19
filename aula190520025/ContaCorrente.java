package com.mycompany.aula190520025;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(double saldo){
        super(saldo);
    }
    
    @Override
    public void Sacar(double valor){
        if(getSaldo()>= (valor+5)){
            setSaldo(getSaldo()-valor-5);
        }else{
            System.out.println("Sem saldo.");
        }
    }
    
    @Override
    public void aplicarRendimento(){
        setSaldo(getSaldo()* 1.025);
    }
    
    @Override
    public String tipoConta(){
        return("Conta Corrente");
    }
}
