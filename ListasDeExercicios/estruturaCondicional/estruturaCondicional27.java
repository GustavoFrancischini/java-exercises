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
        System.out.println("Informe a quantidade em Kg de morangos desejada: ");
        double morango = sc.nextInt();
        System.out.println("Informe a quantidade em Kg de maçãs desejada: ");
        double maca = sc.nextInt();

        double kgFrutas = morango + maca;
        double desconto = 0;
        double valorTotal = 0;
        double valorTotalC = 0;
        double valorTotalM = 0;
        
        if (morango <= 5) {
            valorTotalM = morango * 2.50;
        }
        else{
            valorTotalM = morango * 2.20;
        }

        if (maca <= 5) {
            valorTotalC = maca * 1.80;
        }
        else{
            valorTotalC = maca * 1.50;
        }

        valorTotal = valorTotalC + valorTotalM;

        if (kgFrutas > 8 || valorTotal > 25) {
            desconto = valorTotal * 0.10;
        }

        valorTotal = valorTotal - desconto;

        System.out.printf("O valor total a ser pago é: %.2f", valorTotal);

        sc.close();
        }
}