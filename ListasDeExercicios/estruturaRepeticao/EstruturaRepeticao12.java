package estruturaRepeticao;

/*

Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.

 */

import java.util.*;

public class EstruturaRepeticao12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Type a number: ");
        int num = sc.nextInt();

        for (int i : list) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
