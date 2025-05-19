package com.mycompany.aula190520025;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;
    
    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        contas = new ArrayList<>();
    }
    
    public void MostrarSaldos(){
        System.out.println("Lista de Contas");
        if(contas.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            for(Conta temp : contas){
                System.out.println(temp.tipoConta()+ " : "+temp.getSaldo());
            }
        }
    }
    
    public void CriarConta(double saldo, int tipo){
        if(tipo == 1){
            ContaCorrente c1 = new ContaCorrente(saldo);
            contas.add(c1);
        }else if(tipo == 2){
            ContaPopança c1 = new ContaPopança(saldo);
            contas.add(c1);
        }else{
            System.out.println("Tipo invalido.");
        }
    }
    
    public List<Conta> getContas() {
        return contas;
    }
}
