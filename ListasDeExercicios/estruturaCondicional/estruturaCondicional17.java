package estruturaCondicional;

/* 

Faça um Programa que peça um número correspondente a um 
determinado ano e em seguida informe se este ano é ou não bissexto.

*/

import java.util.*;

public class estruturaCondicional17 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um ano: ");
        int ano = sc.nextInt();
        String print = "";

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            print = "É um ano bissexto.";
        } 
        else {
            print = "Não é um ano bissexto.";
        }
        
        System.out.println(print);

        sc.close();
        }
}