package com.mycompany.aula09052025;

public class VIP extends Ingresso{
    private double valor_adicional = 15;
    private double valor_total;
    
    public VIP(double valor){
        super(valor);
        this.valor_total = valor + valor_adicional;
    }
    
    public void valor_ingresso_VIP(){
        System.out.println(valor_total);
    }
}
