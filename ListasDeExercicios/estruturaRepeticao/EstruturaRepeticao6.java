package estruturaRepeticao;

/*

Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro.

 */

import java.util.*;

public class EstruturaRepeticao6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

       sc.close();
    }
}
