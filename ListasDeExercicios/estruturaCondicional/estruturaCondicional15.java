package estruturaCondicional;

/* 

Faça um Programa que peça os 3 lados de um triângulo. 
O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, 
se o mesmo é: equilátero, isósceles ou escaleno.

Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;

*/

import java.util.*;

public class estruturaCondicional15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira os tamanhos dos lados do triângulo: ");
        System.out.println("Lado 1: ");
        int lado1 = sc.nextInt();
        System.out.println("Lado 2: ");
        int lado2 = sc.nextInt();
        System.out.println("Lado 3: ");
        int lado3 = sc.nextInt();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero: três lados iguais.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles: quaisquer dois lados iguais.");
            } else {
                System.out.println("Triângulo Escaleno: três lados diferentes.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
        
        sc.close();
    }
}