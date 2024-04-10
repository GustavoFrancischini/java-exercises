package estruturaCondicional;

/* 

Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido.

*/

import java.util.*;

public class estruturaCondicional13 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int numeroDigitado = sc.nextInt();

        String diaDaSemana = "";

        switch (numeroDigitado) {
            case 1:
                diaDaSemana = "1 - Domingo";
                break;
            case 2:
                diaDaSemana = "2 - Segunda-feira";
                break;
            case 3:
                diaDaSemana = "3 - Terça-feira";
                break;
            case 4:
                diaDaSemana = "4 - Quarta-feira";
                break;
            case 5:
                diaDaSemana = "5 - Quinta-feira";
                break;
            case 6:
                diaDaSemana = "6 - Sexta-feira";
                break;
            case 7:
                diaDaSemana = "7 - Sábado";
                break;
            default:
                diaDaSemana = "Valor inválido";
                break;
        }

        System.out.println(diaDaSemana);

        sc.close();
        }
}