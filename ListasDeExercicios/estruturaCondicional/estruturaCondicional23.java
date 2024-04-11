package estruturaCondicional;

/* 

Faça um Programa que peça um número e informe se o número é inteiro ou decimal. 
Dica: utilize uma função de arredondamento.

*/

import java.util.*;

public class estruturaCondicional23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        
        if (number == Math.round(number)) {
            System.out.println("Integer number.");
        } else {
            System.out.println("Decimal number.");
        }
        
        sc.close();        
    }
}
