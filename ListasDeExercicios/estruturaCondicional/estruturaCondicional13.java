package estruturaCondicional;

/* 

Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido.

*/

import java.util.*;

public class estruturaCondicional13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int numberEntered = sc.nextInt();
        
        String dayOfWeek = "";
        
        switch (numberEntered) {
            case 1:
                dayOfWeek = "1 - Sunday";
                break;
            case 2:
                dayOfWeek = "2 - Monday";
                break;
            case 3:
                dayOfWeek = "3 - Tuesday";
                break;
            case 4:
                dayOfWeek = "4 - Wednesday";
                break;
            case 5:
                dayOfWeek = "5 - Thursday";
                break;
            case 6:
                dayOfWeek = "6 - Friday";
                break;
            case 7:
                dayOfWeek = "7 - Saturday";
                break;
            default:
                dayOfWeek = "Invalid value";
                break;
        }
        
        System.out.println(dayOfWeek);
        
        sc.close();        
        }
}