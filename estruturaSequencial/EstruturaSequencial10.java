package estruturaSequencial;

/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo. */

import java.util.*;

public class EstruturaSequencial10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter another integer number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter a real number: ");
        double number3 = sc.nextDouble();
        int calculation1 = (number1 * 2) * (number2 / 2);
        double calculation2 = (number1 * 3) + number3;
        double calculation3 = Math.pow(number3, 3);
    
        System.out.printf("The product of the double of the first number with half of the second: %d%n", calculation1);
        System.out.printf("The sum of the triple of the first with the third: %.2f%n", calculation2);
        System.err.printf("The third raised to the power of three: %.2f", calculation3);
        sc.close();

    }
}