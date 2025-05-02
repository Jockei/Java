package com.mycompany.aula02052025;

public class Aula02052025 {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Celso"); 
        
        Aluno a1 = new Aluno("joão");
        Aluno a2 = new Aluno("Pedro");
        
        prof1.adicionarAluno(a1);
        prof1.adicionarAluno(a2);
        
        a1.setProfessor(prof1);
    }
}