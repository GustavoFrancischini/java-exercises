package estruturaSequencial;

// Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class EstruturaSequencial3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
        int number1 = sc.nextInt();
        System.out.println("Type another number: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.printf("The sum of the entered numbers is: %d", sum);
        sc.close();
	}

}
