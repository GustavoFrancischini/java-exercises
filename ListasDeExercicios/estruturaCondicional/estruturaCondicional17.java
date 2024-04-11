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
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        String print;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            print = "It is a leap year.";
        } 
        else {
            print = "It is not a leap year.";
        }

        System.out.println(print);

        sc.close();
        }
}