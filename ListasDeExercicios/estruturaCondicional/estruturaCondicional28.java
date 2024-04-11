package estruturaCondicional;

/* 

O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. 

Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos 
de carne da promoção, porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

*/

import java.util.*;

public class estruturaCondicional28 {
    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Meat Promotion!");
        System.out.println("1 - Double Filet (up to 5kg: $4.90 per kg) or (over 5kg: $5.80 per kg)");
        System.out.println("2 - Rump Steak (up to 5kg: $5.90 per kg) or (over 5kg: $6.80 per kg)");
        System.out.println("3 - Sirloin (up to 5kg: $6.90 per kg) or (over 5kg: $7.80 per kg)");
        System.out.println("");
        System.out.println("Enter the desired meat: (1/2/3)");
        int meatType = sc.nextInt();
        System.out.println("Enter the desired quantity in kg: ");
        double quantity = sc.nextDouble();
        System.out.println("Payment method:");
        System.out.println("1 - Credit/Debit Card");
        System.out.println("2 - PIX/Cash");
        System.out.println("3 - Tabajara Card");
        System.out.println("Enter the desired payment method: (1/2/3)");
        int paymentMethod = sc.nextInt();
        double meatPrice = 0;
        double totalPrice = 0;
        double totalPriceWithDiscount = 0;
        double discount = 0;
        
        if (meatType >= 1 && meatType <= 3) {
            if (quantity > 0) {
                if (meatType == 1) {
                    if (quantity > 0 && quantity <= 5) {
                        meatPrice = 4.90;
                    } else {
                        meatPrice = 5.80;
                    }
                } else if (meatType == 2) {
                    if (quantity > 0 && quantity <= 5) {
                        meatPrice = 5.90;
                    } else {
                        meatPrice = 6.80;
                    }
                } else if (meatType == 3) {
                    if (quantity > 0 && quantity <= 5) {
                        meatPrice = 6.90;
                    } else {
                        meatPrice = 7.80;
                    }
                }
            } else {
                System.out.println("Please enter a positive quantity only.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Please enter valid numbers only.");
            sc.close();
            return;
        }
        
        totalPrice = meatPrice * quantity;
        
        if (paymentMethod >= 1 && paymentMethod <= 3) {
            if (paymentMethod == 3) {
                discount = totalPrice * 0.05;
            }
        }
        
        totalPriceWithDiscount = totalPrice - discount;
        
        // meat type, quantity, payment type, total price, discount value, amount to pay
        System.out.println("");
        System.out.printf("Selected meat type: %d %n", meatType);
        System.out.printf("Selected meat quantity: %.1f kg %n", quantity);
        System.out.printf("Payment method: %d %n", paymentMethod);
        System.out.printf("Total Price: %.1f %n", totalPrice);
        System.out.printf("Discount value: %.1f %n", discount);
        System.out.printf("Amount to pay: %.1f %n", totalPriceWithDiscount);
        

        sc.close();
        }
}