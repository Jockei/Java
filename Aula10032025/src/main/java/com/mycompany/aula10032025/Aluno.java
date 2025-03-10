package com.mycompany.aula10032025;

import java.time.LocalDate;
import java.util.Random;

public class Aluno {
    private String Mátricula;
    private String Nome;
    private String Curso;
    private char Turma;
    private int Periodo;
    private double Nota_1B;
    private double Nota_2B;
    private double Nota_Final;
    static int Qunatidade_de_Alunos;

    public Aluno(){
        
    }
    
    public Aluno(String Nome, String Curso, char Turma, int Periodo) {
        this.Nome = Nome;
        this.Curso = Curso;
        this.Turma = Turma;
        this.Periodo = Periodo;
        this.Qunatidade_de_Alunos++;
        this.Criar_Mátricula();
        
    }
    
    public void Criar_Mátricula() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        
        Random random = new Random();
        
        this.Mátricula = anoAtual + "";
        for(int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            this.Mátricula += randomNumber + "";
        }
    }
    
    public void imprimir() {
        System.out.println("\n\nMátricula: " + this.Mátricula);
        System.out.println("Nome: " + this.Nome);
        System.out.println("Curso: " + this.Curso);
        System.out.println("Turma: " + this.Turma);
        System.out.println("Periodo: " + this.Periodo);
        System.out.println("Nota_1B: " + this.Nota_1B);
        System.out.println("Nota_2B: " + this.Nota_2B);
        System.out.println("Nota_Final: " + this.Nota_Final);
        System.out.println("Qunatidade_de_Alunos: " + this.Qunatidade_de_Alunos + "\n\n");
    }
    
    
    
    
    public void passar(){
        this.Periodo += 1;
    }
    public void passar_Nova_Turma(char Turma) {
        this.Periodo += 1;
        this.Turma = Turma;
    }
    
    public double CalFinal(double Nota_1B, double Nota_2B) {
        this.Nota_1B = Nota_1B;
        this.Nota_2B = Nota_2B;
        this.Nota_Final = (Nota_1B + Nota_2B)/2;
        return this.Nota_Final;
    }

    
    
    
    public String getMátricula() {
        return Mátricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public char getTurma() {
        return Turma;
    }

    public void setTurma(char Turma) {
        this.Turma = Turma;
    }

    public int getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    public double getNota_1B() {
        return Nota_1B;
    }

    public double getNota_2B() {
        return Nota_2B;
    }

    public double getNota_Final() {
        return Nota_Final;
    }
}