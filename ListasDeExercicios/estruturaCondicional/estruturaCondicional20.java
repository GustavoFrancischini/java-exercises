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
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        if (nota1 + nota2 + nota3 > 30 || nota1 + nota2 + nota3 < 0) {
            System.out.println("Insira notas válidas. Max: 10 e Min: 0.");
            System.exit(0);
        }

        double media = (nota1 + nota2 + nota3) / 3;
        String status = "";

        if (media >= 10) {
            status = "Aprovado com Distinção";
        }
        else if(media >= 7){
            status = "Aprovado";
        }
        else{
            status = "Reprovado.";
        }
        
        System.out.println(status);

        sc.close();
        }
}