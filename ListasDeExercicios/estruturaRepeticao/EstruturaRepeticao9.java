package estruturaRepeticao;

// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

import java.util.*;

public class EstruturaRepeticao9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
