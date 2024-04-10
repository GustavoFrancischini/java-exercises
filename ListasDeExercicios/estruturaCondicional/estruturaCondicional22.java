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
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } 
        else{
            System.out.println("Número impar.");
        }

        sc.close();
        }
}