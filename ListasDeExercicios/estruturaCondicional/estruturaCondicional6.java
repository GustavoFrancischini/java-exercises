package estruturaCondicional;

import java.util.*;

// Faça um Programa que leia três números e mostre o maior deles. 

public class estruturaCondicional6 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int number1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number2 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1 > number3){
            System.out.printf("%d é o maior número", number1);
        }
        else if(number2 >= number1 && number2 > number3){
            System.out.printf("%d é o maior número", number2);
        }
        else if(number3 >= number1 && number3 > number2){
            System.out.printf("%d é o maior número.", number3);
        }
        else{
            System.out.println("Todos os números são iguais.");
        }
    sc.close(); 
	}
}
