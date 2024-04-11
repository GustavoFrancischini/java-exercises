package estruturaCondicional;

/* Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso */

import java.util.*;

public class estruturaCondicional10 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shift you study in: ");
        System.out.println("M - Morning: ");
        System.out.println("A - Afternoon: ");
        System.out.println("E - Evening: ");
        char shift = sc.next().toUpperCase().charAt(0);
        
        if(shift == 'M'){
            System.out.println("Good morning!");
        }
        else if(shift == 'A'){
            System.out.println("Good afternoon!");
        }
        else if(shift == 'E'){
            System.out.println("Good evening!");
        }
        else{
            System.out.println("Invalid letter.");
        }
        sc.close(); 
	}
}

