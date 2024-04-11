package estruturaCondicional;

import java.util.*;

// Faça um Programa que peça dois números e imprima o maior deles.

public class estruturaCondicional1 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter another integer number: ");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.printf("%d is greater than %d", number1, number2);
        }
        else if (number1 == number2){
            System.out.printf("%d is equal to %d", number1, number2);
        }
        else{
            System.out.printf("%d is greater than %d", number2, number1);
        }

    sc.close(); 
	}
}
