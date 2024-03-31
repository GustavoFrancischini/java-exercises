package estruturaCondicional;

import java.util.*;

// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class estruturaCondicional2 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int number1 = sc.nextInt();

        if(number1 > 0){
            System.out.printf("%d é um número positivo.", number1);
        }
        else if (number1 == 0){
            System.out.printf("%d é um zero.", number1);
        }
        else{
            System.out.printf("%d é um número negativo.", number1);
        }

    sc.close(); 
	}
}
