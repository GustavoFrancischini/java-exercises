package estruturaCondicional;

/* 

Faça um programa que lê as duas notas parciais obtidas por um aluno numa 
disciplina ao longo de um semestre, e calcule a sua média. 

A atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a 
mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

*/

import java.util.*;

public class estruturaCondicional14 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first grade: ");
        int firstGrade = sc.nextInt();
        System.out.println("Enter the second grade: ");
        int secondGrade = sc.nextInt();
        
        double average = (firstGrade + secondGrade) / 2;
        String concept = "";
        String result;
        
        if (average >= 9.0 && average <= 10) {
            concept = "Concept: A";
        }
        else if (average >= 7.5 && average < 9.0) {
            concept = "Concept: B";
        }
        else if (average >= 6.0 && average < 7.5) {
            concept = "Concept: C";
        }
        else if (average >= 4.0 && average < 6.0) {
            concept = "Concept: D";
        }
        else if (average >= 0 && average < 4.0) {
            concept = "Concept: E";
        }        
        else{
            System.out.println("Enter only valid grades.");
            System.exit(0);
        }
        
        if(average < 6){
            result = "Failed!";
        }
        else{
            result = "Approved!";
        }
        
        System.out.printf("Average: %.2f - %s - %s", average, concept, result);
        
        
        sc.close();
        }
}