
package com.mycompany.agendatelefonica;

//import java.util.HashMap;
//import java.util.Map;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
//    private Map<String, Contato> colecao;
    private List<Contato> colecao; 
    
    public Agenda(){
//        this.colecao = new HashMap<>();
          this.colecao = new ArrayList<>();
    }
    
    public void inserir(String nome, String telefone){
        Contato temp = new Contato(nome, telefone);
//        this.colecao.put(nome, temp);
          this.colecao.add(temp);
    }
    
    public Contato existe(String nome){
        Contato contat = null;
        
        for (Contato contato : colecao) {
            
            if (contato.getNome().contains(nome)) {
                contat = contato;
                return contat;
            }
            
        }
        return null;
    }
    
    public String buscar(String nome){
        Contato contat = existe(nome);
        
        if (contat == null) {
            return "Não encontrado";
        } else {
            return contat.toString();
        }
        
    }
    
    public int Quantidade(){
        return this.colecao.size();
    }
    
    public void excluir(String nome){
        Contato contat = existe(nome);
        this.colecao.remove(contat);
    }
    
    public void imprimir(){
        if (this.colecao == null) {
            System.out.println("Agenda vazia");
        }
//        for (Map.Entry<String, Contato> contato: colecao.entrySet()) {;
//            System.out.println(contato.getValue());
//        }
        System.out.println("\n\n");
        for (Contato contato : colecao) {
            System.out.println(contato);
        }
    }
    
}

