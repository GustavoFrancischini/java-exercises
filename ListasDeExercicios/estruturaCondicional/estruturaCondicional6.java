package estruturaCondicional;

import java.util.*;

// Faça um Programa que leia três números e mostre o maior deles. 

public class estruturaCondicional6 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter another integer number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter another integer number: ");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1 > number3){
            System.out.printf("%d is the largest number", number1);
        }
        else if(number2 >= number1 && number2 > number3){
            System.out.printf("%d is the largest number", number2);
        }
        else if(number3 >= number1 && number3 > number2){
            System.out.printf("%d is the largest number.", number3);
        }
        else{
            System.out.println("All numbers are equal.");
        }
    sc.close(); 
	}
}
