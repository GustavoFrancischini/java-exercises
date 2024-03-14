package estruturaSequencial;

/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */

import java.util.*;

public class EstruturaSequencial12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please type 'H' if you are a man, and 'M' if you are a woman: ");
        char gender = sc.next().toUpperCase().charAt(0);
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
                
        if (gender == 'H') {
            double calculation = (72.7 * height) - 58;
            System.out.printf("Your ideal weight: %.2f", calculation);
        } else if (gender == 'M') {
            double calculation2 = (62.1 * height) - 44.7;
            System.out.printf("Your ideal weight: %.2f", calculation2);
        } else {
            System.out.println("Please only enter 'H' or 'M'");
        }
        sc.close();

    }
}