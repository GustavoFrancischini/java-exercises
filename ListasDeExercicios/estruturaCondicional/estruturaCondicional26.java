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
        System.out.println("Qual combústivel você deseja? (G/A)");
        char combustivel = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("Quantos litros você deseja? ");
        int litros = sc.nextInt();

        double desconto = 0;
        double valorLitro = 0;
        double valorTotal = 0;

        if (combustivel == 'g') {
            valorLitro = 2.50;
            valorTotal = valorLitro * litros;
            if (litros <= 20) {
                desconto = 0.04;
            }
            else{
                desconto = 0.06;
            }
        }
        else if (combustivel == 'a') {
            valorLitro = 1.90;
            valorTotal = valorLitro * litros;
            if (litros <= 20) {
                desconto = 0.03;
            }
            else{
                desconto = 0.05;
            }
        }
        else{
            System.out.println("Digite somente as letras válidas para os combústiveis.");
            System.exit(0);
        }

        
        double descontoFinal = valorTotal * desconto;
        valorTotal = valorTotal - descontoFinal;

        System.out.println(valorTotal);

        sc.close();
        }
}