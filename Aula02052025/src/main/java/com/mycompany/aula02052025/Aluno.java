package com.mycompany.aula02052025;

public class Aluno {
    private String nome;
    private Professor professor;
    
    public Aluno (String nome){
        this.nome = nome;
    }
    
    public void setProfessor(Professor prof){
        professor = prof;
        prof.adicionarAluno(this);
    }
    
    public Professor getProfessor(){
        return professor;
    }
}