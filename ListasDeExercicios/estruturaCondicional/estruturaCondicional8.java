package estruturaCondicional;

/* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato. */

import java.util.*;

public class estruturaCondicional8 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the first product: ");
        double product1 = sc.nextDouble();
        System.out.println("Enter the value of the second product: ");
        double product2 = sc.nextDouble();
        System.out.println("Enter the value of the third product: ");
        double product3 = sc.nextDouble();

        if(product1 < product2 && product1 < product3){
            System.out.println("Buy the first product, as it is the cheapest.");
        }
        else if(product2 < product1 && product2 < product3){
            System.out.println("Buy the second product, as it is the cheapest.");
        }
        else if(product3 < product1 && product3 < product2){
            System.out.println("Buy the third product, as it is the cheapest.");
        }
        else if (product1 == product2 && product1 == product3) {
            System.out.println("All products have the same value.");
        }
        else {
            System.out.println("Two or more products have the same value.");
        }

        sc.close(); 
	}
}

