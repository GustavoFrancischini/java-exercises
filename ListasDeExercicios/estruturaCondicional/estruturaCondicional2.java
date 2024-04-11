package estruturaCondicional;

import java.util.*;

// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class estruturaCondicional2 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int number1 = sc.nextInt();

        if(number1 > 0){
            System.out.printf("%d is a positive number.", number1);
        }
        else if (number1 == 0){
            System.out.printf("%d is zero.", number1);
        }
        else{
            System.out.printf("%d is a negative number.", number1);
        }

    sc.close(); 
	}
}
