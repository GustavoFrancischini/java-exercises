package estruturaCondicional;

/* Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso */

import java.util.*;

public class estruturaCondicional10 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o turno que você estuda: ");
        System.out.println("M - Matutino: ");
        System.out.println("V - Verspertino: ");
        System.out.println("N - Noturno: ");
        char turno = sc.next().toUpperCase().charAt(0);
        
        if(turno == 'M'){
            System.out.println("Bom dia!");
        }
        else if(turno == 'V'){
            System.out.println("Boa tarde!");
        }
        else if(turno == 'N'){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Letra inválida.");
        }
        sc.close(); 
	}
}

