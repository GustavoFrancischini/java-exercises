package estruturaSequencial;

// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class EstruturaSequencial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
        int number = sc.nextInt();
        System.out.printf("The entered number was %d%n", number);
        sc.close();
	}

}
