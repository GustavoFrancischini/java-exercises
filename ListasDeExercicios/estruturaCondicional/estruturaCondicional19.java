package estruturaCondicional;

/* 

Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. 

Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades 
Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.

*/

import java.util.*;

public class estruturaCondicional19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer less than 1000: ");
        String numberStr = sc.next();

        if (numberStr.length() < 3) {
            System.out.println("Please, enter a number with at least three digits. Use 0 if there is no hundred or ten.");
            System.exit(0);
        }

        char hundred = numberStr.charAt(0);
        char ten = numberStr.charAt(1);
        char unit = numberStr.charAt(2);

        if (hundred == '1') {
            System.out.printf("%s hundred", hundred);
        } else {
            System.out.printf("%s hundreds", hundred);
        }

        if (ten == '1') {
            System.out.printf(" %s ten", ten);
        } else {
            System.out.printf(" %s tens", ten);
        }

        if (unit == '1') {
            System.out.printf(" and %s unit.", unit);
        } else {
            System.out.printf(" and %s units.", unit);
        }

        sc.close();
    }
}