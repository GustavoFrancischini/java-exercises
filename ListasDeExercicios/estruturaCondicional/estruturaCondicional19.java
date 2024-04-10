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
        System.out.println("Informe um número inteiro menor que 1000: ");
        String numeroStr = sc.next();

        if (numeroStr.length() < 3) {
            System.out.println("Por favor, insira um número de pelo menos três dígitos. Use o 0 caso não tenha centena ou dezena.");
            System.exit(0);
        }

        char centena = numeroStr.charAt(0);
        char dezena = numeroStr.charAt(1);
        char unidade = numeroStr.charAt(2);

        if (centena == '1') {
            System.out.printf("%s centena", centena);
        } else {
            System.out.printf("%s centenas", centena);
        }

        if (dezena == '1') {
            System.out.printf(" %s dezena", dezena);
        } else {
            System.out.printf(" %s dezenas", dezena);
        }

        if (unidade == '1') {
            System.out.printf(" e %s unidade.", unidade);
        } else {
            System.out.printf(" e %s unidades.", unidade);
        }

        sc.close();
    }
}