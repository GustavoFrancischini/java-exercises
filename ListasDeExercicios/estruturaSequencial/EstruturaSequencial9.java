package estruturaSequencial;

/* Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */

import java.util.*;

public class EstruturaSequencial9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperatureFahrenheit = sc.nextDouble();
        double temperatureCelsius = 5 * ((temperatureFahrenheit - 32) / 9);
        System.out.printf("The temperature in Celsius is %.1fºC", temperatureCelsius);
        sc.close();

    }
}