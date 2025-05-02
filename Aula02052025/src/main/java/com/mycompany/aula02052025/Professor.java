package com.mycompany.aula02052025;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos;
    
    public Professor (String nome){
        this.nome = nome;
        this.alunos = new ArrayList();
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.setProfessor(this);
    }
}