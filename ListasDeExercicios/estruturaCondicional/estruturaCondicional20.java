package estruturaCondicional;

/* 

Faça um Programa para leitura de três notas parciais de um aluno. 

O programa deve calcular a média alcançada por aluno e presentar:

A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.

*/

import java.util.*;

public class estruturaCondicional20 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        double grade2 = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        double grade3 = sc.nextDouble();
        
        if (grade1 + grade2 + grade3 > 30 || grade1 + grade2 + grade3 < 0) {
            System.out.println("Please enter valid grades. Max: 10 and Min: 0.");
            System.exit(0);
        }
        
        double average = (grade1 + grade2 + grade3) / 3;
        String status;
        
        if (average >= 10) {
            status = "Approved with Distinction";
        }
        else if (average >= 7){
            status = "Approved";
        }
        else{
            status = "Failed.";
        }
        
        System.out.println(status);
        
        sc.close();        
    }
}    