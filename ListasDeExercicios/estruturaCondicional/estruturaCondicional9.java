package estruturaCondicional;

// Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.*;

public class estruturaCondicional9 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int number1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number2 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number2 >= number3){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number1, number2, number3);
        }
        else if(number1 >= number3 && number3 >= number2){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number1, number3, number2);
        }
        else if(number2 >= number1 && number1 >= number3){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number2, number1, number3);
        }
        else if(number2 >= number3 && number3 >= number1){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number2, number3, number1);
        }
        else if(number3 >= number2 && number2 >= number1){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number3, number2, number1);
        }
        else if(number3 >= number1 && number1 >= number2){
            System.out.printf("%d, %d, %d é a ordem decrescente.", number3, number1, number2);
        }
        else{
            System.out.println("Todos os números são iguais.");
        }
        sc.close(); 
	}
}

