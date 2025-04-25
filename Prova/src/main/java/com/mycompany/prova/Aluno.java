package com.mycompany.prova;

public class Aluno {
    private String nome;
    private String mail;
    private int matricula;
    private static int quatidadeAluno;
    
    public Aluno (String nome, String mail, int matricula){
        this.nome = nome;
        this.mail = mail;
        this.matricula = matricula;
        quatidadeAluno++;
    }
}
