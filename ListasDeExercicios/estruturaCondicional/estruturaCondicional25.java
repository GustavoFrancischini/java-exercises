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
        System.out.println("Telefonou para a vítima? (S/N)");
        char telefonou = sc.next().toUpperCase().charAt(0);
        System.out.println("Esteve no local do crime? (S/N)");
        char local = sc.next().toUpperCase().charAt(0);
        System.out.println("Mora perto da vítima? (S/N)");
        char mora = sc.next().toUpperCase().charAt(0);
        System.out.println("Devia para a vítima? (S/N)");
        char devia = sc.next().toUpperCase().charAt(0);
        System.out.println("Já trabalhou com a vítima? (S/N)");
        char trabalhou = sc.next().toUpperCase().charAt(0);

        int soma = 0;

        if (telefonou == 'S') {
            soma += 1;
        }
        if (local == 'S') {
            soma += 1;
        }
        if(mora == 'S') {
            soma += 1;
        }
        if(devia == 'S') {
            soma += 1;
        }
        if (trabalhou == 'S' ) {
            soma += 1;
        }

        String classificacao = "";

        if (soma == 2) {
            classificacao = "Suspeita";
        }
        else if (soma == 3 || soma == 4) {
            classificacao = "Cúmplice";
        }
        else if (soma == 5) {
            classificacao = "Assasino";
        }
        else{
            classificacao = "Inocente";
        }

        System.out.println(classificacao);

        sc.close();
        }
}