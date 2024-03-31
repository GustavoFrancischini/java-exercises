package estruturaSequencial;

// Faça um Programa que converta metros para centímetros.

import java.util.*;

public class EstruturaSequencial5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value in meters: ");
        double meters = sc.nextDouble();
        double converter = meters * 100;
        System.out.printf("The conversion to centimeters of the entered value is: %.0fcm", converter);
        sc.close();

	}

}
