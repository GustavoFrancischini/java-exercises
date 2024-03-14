package estruturaSequencial;

/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do 
estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.

João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas. */

import java.util.*;

public class EstruturaSequencial13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fish weight: ");
        double fishWeight = sc.nextDouble();

        if (fishWeight <= 50) {
            System.out.println("No fees today.");
        } else {
            double calculation = (fishWeight - 50) * 4;
            System.out.printf("Today you will have to pay R$%.2f in fees for the excess kg.", calculation);
        }
        sc.close();
    }
}

