package estruturaCondicional;

/* 

Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 

Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e 
escreva o valor a ser pago pelo cliente.

*/

import java.util.*;

public class estruturaCondicional27 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired quantity of strawberries in kg: ");
        double strawberries = sc.nextInt();
        System.out.println("Enter the desired quantity of apples in kg: ");
        double apples = sc.nextInt();
        
        if (strawberries <= 0 || apples <= 0) {
            System.out.println("The quantity of fruits must be a positive number.");
            sc.close();
            return;
        }
        
        double totalKg = strawberries + apples;
        double discount = 0;
        double totalPrice = 0;
        double totalApplePrice = 0;
        double totalStrawberryPrice = 0;
        
        if (strawberries <= 5) {
            totalStrawberryPrice = strawberries * 2.50;
        } else {
            totalStrawberryPrice = strawberries * 2.20;
        }
        
        if (apples <= 5) {
            totalApplePrice = apples * 1.80;
        } else {
            totalApplePrice = apples * 1.50;
        }
        
        totalPrice = totalApplePrice + totalStrawberryPrice;
        
        if (totalKg > 8 || totalPrice > 25) {
            discount = totalPrice * 0.10;
        }
        
        totalPrice -= discount;
        
        System.out.printf("The total amount to be paid is: %.2f", totalPrice);
        
        sc.close();
        }
}