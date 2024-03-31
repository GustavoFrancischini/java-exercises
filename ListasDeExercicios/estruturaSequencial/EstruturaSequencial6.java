package estruturaSequencial;

// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.*;

public class EstruturaSequencial6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is: %.2f", area);
        sc.close();

	}

}
