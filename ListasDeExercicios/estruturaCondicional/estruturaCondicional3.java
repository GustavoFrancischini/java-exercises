package estruturaCondicional;

import java.util.*;

/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

public class estruturaCondicional3 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender, 'M' for male and 'F' for female: ");
        char gender = sc.next().toUpperCase().charAt(0);

        if(gender == 'M'){
            System.out.printf("M - Male", gender);
        }
        else if (gender == 'F'){
            System.out.printf("F - Female", gender);
        }
        else{
            System.out.printf("Invalid gender.");
        }

    sc.close(); 
	}
}
