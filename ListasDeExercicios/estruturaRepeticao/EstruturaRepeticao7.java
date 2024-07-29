package estruturaRepeticao;

// Faça um programa que leia 5 números e informe o maior número.

import java.util.*;

public class EstruturaRepeticao7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        
        System.out.println("The numbers entered were: " + list);
        
        int maxNum = Collections.max(list);
        System.out.println("The highest number entered was: " + maxNum);

        sc.close();
    }
}
