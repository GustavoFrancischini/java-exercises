package estruturaCondicional;

/* 

Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 

As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada 
como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
Caso contrário, ele será classificado como "Inocente".

*/

import java.util.*;

public class estruturaCondicional25 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Did you call the victim? (Y/N)");
        char calledVictim = sc.next().toUpperCase().charAt(0);
        System.out.println("Did you go to the crime scene? (Y/N)");
        char wentToScene = sc.next().toUpperCase().charAt(0);
        System.out.println("Do you live near the victim? (Y/N)");
        char liveNearVictim = sc.next().toUpperCase().charAt(0);
        System.out.println("Do you owe money to the victim? (Y/N)");
        char oweMoney = sc.next().toUpperCase().charAt(0);
        System.out.println("Have you worked with the victim before? (Y/N)");
        char workedWithVictim = sc.next().toUpperCase().charAt(0);
        
        int sum = 0;
        
        if (calledVictim == 'Y') {
            sum += 1;
        }
        if (wentToScene == 'Y') {
            sum += 1;
        }
        if (liveNearVictim == 'Y') {
            sum += 1;
        }
        if (oweMoney == 'Y') {
            sum += 1;
        }
        if (workedWithVictim == 'Y') {
            sum += 1;
        }
        
        String classification;
        
        if (sum == 2) {
            classification = "Suspect";
        } else if (sum >= 3 && sum <= 4) {
            classification = "Accomplice";
        } else if (sum == 5) {
            classification = "Assassin";
        } else {
            classification = "Innocent";
        }
        
        System.out.println(classification);        

        sc.close();
        }
}