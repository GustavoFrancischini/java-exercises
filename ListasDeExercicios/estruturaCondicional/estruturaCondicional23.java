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
        
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        if (numero == Math.round(numero)) {
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }

        sc.close();
    }
}
