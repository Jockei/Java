
package com.mycompany.agendatelefonica;

import java.util.Objects;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Numero: " + numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
    
    
}
