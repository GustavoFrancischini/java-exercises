package estruturaCondicional;

import java.util.*;

// Faça um Programa que peça dois números e imprima o maior deles.

public class estruturaCondicional1 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int number1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.printf("%d é maior que %d", number1, number2);
        }
        else if (number1 == number2){
            System.out.printf("%d é igual a %d", number1, number2);
        }
        else{
            System.out.printf("%d é maior que %d", number2, number1);
        }

    sc.close(); 
	}
}
