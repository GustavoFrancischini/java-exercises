package estruturaCondicional;

/* 

Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

*/

import java.util.*;

public class estruturaCondicional18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the format dd/mm/yyyy: ");
        String date = sc.nextLine();
        
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        boolean validDate = true;
        
        if (month < 1 || month > 12 || day < 1 || year <= 0) {
            validDate = false;
        } else {
            int daysInMonth = 31; 
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (month == 2) {
                daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            }
            if (day > daysInMonth) {
                validDate = false;
            }
        }
        
        if (validDate) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is invalid.");
        }       
         
        sc.close();
    }
}
