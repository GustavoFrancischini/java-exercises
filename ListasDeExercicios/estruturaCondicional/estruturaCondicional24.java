package estruturaCondicional;

/* 

Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.

*/

import java.util.*;

public class estruturaCondicional24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose the operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
        int operation = sc.nextInt();

        double result = 0;
        String numberType = "";

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        if (result % 2 == 0) {
            numberType += "even, ";
        } else {
            numberType += "odd, ";
        }

        if (result >= 0) {
            numberType += "positive, ";
        } else {
            numberType += "negative, ";
        }

        if (result == Math.round(result)) {
            numberType += "integer.";
        } else {
            numberType += "decimal.";
        }

        System.out.println("The result of the operation is: " + result);
        System.out.println("The resulting number is " + numberType);

        sc.close();
    }
}