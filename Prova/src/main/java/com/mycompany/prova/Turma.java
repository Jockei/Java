package com.mycompany.prova;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private int numero;
    public static int quatidadeAluno;
    public List <Aluno> aluno;
    public List <Avaliação> avaliação;
    
    public Turma (String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.aluno = new ArrayList<>();
        this.avaliação = new ArrayList<>();
    }
    
    public void adicionar_aluno(String nome, String mail, int matricula){
        aluno.add(new Aluno(nome, mail, matricula));
        quatidadeAluno++;
    }
    
        public void avaliaçãoExclusiva(String assunto, int valor){
        avaliação.add(new Avaliação(assunto, valor));
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public static int getQuatidadeAluno() {
        return quatidadeAluno;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }
    
}
