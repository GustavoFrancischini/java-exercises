package estruturaCondicional;

/* 

Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
Dica: utilize o operador módulo (resto da divisão).

*/

import java.util.*;

public class estruturaCondicional22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("Even number.");
        } 
        else{
            System.out.println("Odd number.");
        }
        
        sc.close();        
        }
}