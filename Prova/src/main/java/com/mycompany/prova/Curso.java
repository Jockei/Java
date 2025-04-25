package com.mycompany.prova;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String carga_horaria;
    private Professor professor;
    private static int quatidadeAluno;
    public List <Turma> turma;
    
    public Curso (String nome, String carga_horaria, Professor professor){
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.professor = professor;
        this.turma = new ArrayList<>();
    }
    
    public void trocaProfessor(Professor professor){
        this.professor = professor;
    }
    
    public void turma(Turma turma){
        this.turma.add(turma);
        Curso.quatidadeAluno += Turma.getQuatidadeAluno();
    }
}
