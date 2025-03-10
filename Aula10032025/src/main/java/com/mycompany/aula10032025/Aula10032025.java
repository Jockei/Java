package com.mycompany.aula10032025;

public class Aula10032025 {

    public static void main(String[] args) {
        System.out.println("");
        
        String Nome = "João";
        String Curso = "Computaria";
        char Turma = 'B';
        int Periodo = 5;
        double Nota_1B = 5.5;
        double Nota_2B = 8.5;
        
        Aluno b = new Aluno(Nome, Curso, Turma, Periodo);
        
        b.passar();
        b.passar_Nova_Turma('C');
        b.CalFinal(Nota_1B, Nota_2B);
        b.imprimir();
    }
}
