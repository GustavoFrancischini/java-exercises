package estruturaCondicional;

/* 

Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro. 

Escreva um algoritmo que leia o número de litros vendidos, o tipo 
de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do 
litro do álcool é R$ 1,90.

*/

import java.util.*;

public class estruturaCondicional26 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Which fuel do you want? (G/A)");
        char fuelType = sc.next().toLowerCase().charAt(0);
        System.out.println("How many liters do you want?");
        int liters = sc.nextInt();
        
        if (liters <= 0) {
            System.out.println("The number of liters must be a positive number.");
            sc.close();
            return;
        }
        
        double discount = 0;
        double pricePerLiter = 0;
        double totalPrice = 0;
        
        if (fuelType == 'g') {
            pricePerLiter = 2.50;
            if (liters <= 20) {
                discount = 0.04;
            } else {
                discount = 0.06;
            }
        } else if (fuelType == 'a') {
            pricePerLiter = 1.90;
            if (liters <= 20) {
                discount = 0.03;
            } else {
                discount = 0.05;
            }
        } else {
            System.out.println("Please enter only valid letters for fuels.");
            sc.close();
            return;
        }
        
        totalPrice = pricePerLiter * liters;
        double finalDiscount = totalPrice * discount;
        totalPrice -= finalDiscount;
        
        System.out.println(totalPrice);        

        sc.close();
        }
}