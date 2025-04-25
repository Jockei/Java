package com.mycompany.prova;

public class Prova {
    public static void main(String[] args){
        Professor professor = new Professor("Cassio", "Programação Orientada a Objetos");
        
        Curso curso = new Curso("Programação Orientada a Objetos", "60h", professor);
        
        Aluno aluno = new Aluno("João", "joão.gabriel@yahoo.com", 202413765);
        
        Turma turma = new Turma("CC3M", 45);
        turma.adicionar_aluno("João", "joão.gabriel@yahoo.com", 202413765);
        turma.avaliaçãoExclusiva("Programação Orientada a Objetos", 10);
        
        Avaliação avaliação = new Avaliação("Programação Orientada a Objetos", 10);
    }
}
