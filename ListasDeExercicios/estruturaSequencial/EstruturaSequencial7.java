package estruturaSequencial;

// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.*;

public class EstruturaSequencial7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of one side of the square: ");
		double sideOfSquare = sc.nextDouble();
		double squareArea = sideOfSquare * sideOfSquare;
		double doubleArea = squareArea * 2;
		System.out.printf("The area of the square is %.1f, and its double is %.1f", squareArea, doubleArea);
		sc.close();

	}
}