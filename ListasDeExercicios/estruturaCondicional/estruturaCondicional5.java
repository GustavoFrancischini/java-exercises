package estruturaCondicional;

import java.util.*;

/* Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

public class estruturaCondicional5 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        double average = (grade1 + grade2) / 2;

        if(average >= 7){
            System.out.println("Approved.");
        }
        else if(average == 10){
            System.out.println("Approved with distinction.");
        }
        else{
            System.out.println("Failed.");
        }
    sc.close(); 
	}
}
