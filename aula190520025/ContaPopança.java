package com.mycompany.aula190520025;

public class ContaPopança extends Conta{
    
    public ContaPopança(double saldo){
    super(saldo);
    }
    
    @Override
    public void Sacar(double valor){
        if(getSaldo()>= (valor+15)){
            setSaldo(getSaldo()-valor-15);
        }else{
            System.out.println("Sem saldo.");
        }
    }
    
    @Override
    public void aplicarRendimento(){
        setSaldo(getSaldo()* 1.005);
    }
    
    @Override
    public String tipoConta(){
        return("Conta Poupança");
    }
}
