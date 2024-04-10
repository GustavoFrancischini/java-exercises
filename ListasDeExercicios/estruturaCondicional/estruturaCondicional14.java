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
        System.out.println("Digite a primeira nota: ");
        int primeiraNota = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int segundaNota = sc.nextInt();

        double media = (primeiraNota + segundaNota) / 2;
        String conceito = "";
        String resultado= "";

        if (media >= 9.0 && media <= 10) {
            conceito = "Conceito: A";
        }
        else if (media >= 7.5 && media < 9.0) {
            conceito = "Conceito: B";
        }
        else if (media >= 6.0 && media < 7.5) {
            conceito = "Conceito: C";
        }
        else if (media >= 4.0 && media < 6.0) {
            conceito = "Conceito: D";
        }
        else if (media >= 0 && media < 4.0) {
            conceito = "Conceito: E";
        }        
        else{
            System.out.println("Digite somente notas válidas.");
            System.exit(0);
        }

        if(media < 6){
            resultado = "Reprovado!";
        }
        else{
            resultado = "Aprovado!";
        }

        System.out.printf("Média: %.2f - %s - %s", media, conceito, resultado);
        

        sc.close();
        }
}