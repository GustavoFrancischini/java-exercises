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

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aprovado.");
        }
        else if(media == 10){
            System.out.println("Aprovado com distinção.");
        }
        else{
            System.out.println("Reprovado.");
        }
    sc.close(); 
	}
}
