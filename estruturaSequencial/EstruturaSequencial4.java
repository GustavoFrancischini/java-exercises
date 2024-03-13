package estruturaSequencial;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.*;

public class EstruturaSequencial4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade of the first quarter: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the grade of the second quarter: ");
        double grade2 = sc.nextDouble();
        System.out.println("Enter the grade of the third quarter: ");
        double grade3 = sc.nextDouble();
        System.out.println("Enter the grade of the fourth quarter: ");
        double grade4 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.printf("The average grade is: %.2f", average);
        sc.close();
    }

}

