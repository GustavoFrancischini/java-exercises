package estruturaRepeticao;

// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.*;

public class EstruturaRepeticao10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        
        if (num2 < num1 || num1 < num2) {
            while (num2 < num1 || num1 < num2) {
                if (num1 < num2) {
                    num1++;
                    if (num1 < num2) {
                        System.out.println(num1);
                    }
                } else {
                    num2++;
                    if (num2 < num1) {
                        System.out.println(num2);
                    }
                }
            }
        } else {
            System.out.println("The numbers are the same.");
        }
        
        sc.close();
    }
}
