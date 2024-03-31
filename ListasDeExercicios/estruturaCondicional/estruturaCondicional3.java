package estruturaCondicional;

import java.util.*;

/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

public class estruturaCondicional3 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu gênero, sendo 'M' para masculino e 'F' para feminino: ");
        char gender = sc.next().toUpperCase().charAt(0);

        if(gender == 'M'){
            System.out.printf("M - Masculino", gender);
        }
        else if (gender == 'F'){
            System.out.printf("F - Feminino", gender);
        }
        else{
            System.out.printf("Sexo inválido.");
        }

    sc.close(); 
	}
}
