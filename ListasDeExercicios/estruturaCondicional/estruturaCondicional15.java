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
        System.out.println("Please, enter the lengths of the triangle sides: ");
        System.out.println("Side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Side 3: ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side1 == side3) {
                System.out.println("Equilateral Triangle: three equal sides.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle: any two equal sides.");
            } else {
                System.out.println("Scalene Triangle: three different sides.");
            }
        } else {
            System.out.println("It is not a triangle.");
        }

        sc.close();
    }
}