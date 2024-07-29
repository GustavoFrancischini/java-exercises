package estruturaRepeticao;

/*

Altere o programa anterior para mostrar no final a soma dos números.

 */

import java.util.*;

public class EstruturaRepeticao11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        
        if (num2 < num1 || num1 < num2) {
            while (num2 < num1 || num1 < num2) {
                if (num1 < num2) {
                    num1++;
                    if (num1 < num2) {
                        list.add(num1);
                    }
                } else {
                    num2++;
                    if (num2 < num1) {
                        list.add(num2);
                    }
                }
            }
        } else {
            System.out.println("The numbers are the same.");
        }
        
        System.out.println("The numbers between the entered numbers are: " + list);
        int sum = 0; // variable to store the sum
        
        for (int num : list) {
            sum += num;
        }
        
        System.out.println("The sum of the numbers in the list is: " + sum);
        
        sc.close();

    }
}
