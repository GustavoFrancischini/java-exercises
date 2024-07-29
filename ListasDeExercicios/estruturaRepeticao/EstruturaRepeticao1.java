package estruturaRepeticao;

/*

Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

*/

import java.util.*;

public class EstruturaRepeticao1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a grade between 0 and 10: ");
        double grade = sc.nextDouble();
        
        while (grade < 0 || grade > 10) {
            System.out.println("Invalid grade. Enter a grade between 0 and 10: ");
            grade = sc.nextDouble();
        }
        
        System.out.println("Valid grade: " + grade);
        sc.close();
    }
}
