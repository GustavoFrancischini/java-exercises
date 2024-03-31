package estruturaCondicional;

import java.util.*;

// Faça um Programa que leia três números e mostre o MAIOR E O MENOR deles.

public class estruturaCondicional7 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int number1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number2 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1 > number3){
            System.out.printf("%d é o maior número. %n", number1);
        }
        else if(number2 >= number1 && number2 > number3){
            System.out.printf("%d é o maior númer. %n", number2);
        }
        else if(number3 >= number1 && number3 > number2){
            System.out.printf("%d é o maior número. %n", number3);
        }
        if(number1 <= number2 && number1 < number3){
            System.out.printf("%d é o menor número. %n", number1);
        }
        else if(number2 <= number1 && number2 < number3){
            System.out.printf("%d é o menor número. %n", number2);
        }
        else if(number3 <= number1 && number3 < number2){
            System.out.printf("%d é o menor número. %n", number3);
        }
        else{
            System.out.println("Todos os números são iguais.");
        }

        // Poderia usar operador ternário para simplificar essa estrutura de if-else.

    sc.close(); 
	}
}
