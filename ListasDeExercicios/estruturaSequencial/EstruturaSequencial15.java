package estruturaSequencial;

/* Faça um programa para uma loja de tintas. 

O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e 
que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 

Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */

import java.util.*;

public class EstruturaSequencial15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size in square meters of the area to be painted?");
        double sizeSquareMeters = sc.nextDouble();
        
        double coveragePerCan = 18 * 3;
        double numberOfCans = Math.ceil(sizeSquareMeters / coveragePerCan);
        
        double pricePerCan = 80.00;
        double totalCost = numberOfCans * pricePerCan;
        
        System.out.printf("Buy %.0f cans and pay $%.2f.", numberOfCans, totalCost);
        
        sc.close();
        
    }

}
