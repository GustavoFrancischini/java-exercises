package estruturaRepeticao;

// Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.*;

public class EstruturaRepeticao8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        
        int sum = list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4);
        System.out.println("The sum of the numbers entered was: " + sum);
        int average = sum / 5;
        System.out.println("The average of the numbers entered was: " + average);
        
        sc.close();
    }
}
