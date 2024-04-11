package estruturaCondicional;

/* 

Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e 
depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 

O valor mínimo é de 10 reais e o máximo de 600 reais. 
O programa não deve se preocupar com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

*/

import java.util.*;

public class estruturaCondicional21 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int withDrawAmount, notes100, notes50, notes10, notes5, notes1;
        System.out.print("Enter the amount you want to withdraw (between 10 and 600 reais): ");
        withDrawAmount = sc.nextInt();
        
        if (withDrawAmount < 10 || withDrawAmount > 600) {
            System.out.println("Invalid withdrawal amount. The minimum amount is 10 reais and the maximum is 600 reais.");
            sc.close();
            return;
        }
        
        notes100 = withDrawAmount / 100;
        withDrawAmount %= 100;
        
        notes50 = withDrawAmount / 50;
        withDrawAmount %= 50;
        
        notes10 = withDrawAmount / 10;
        withDrawAmount %= 10;
        
        notes5 = withDrawAmount / 5;
        withDrawAmount %= 5;
        
        notes1 = withDrawAmount;
        
        System.out.println("100 reais notes: " + notes100);
        System.out.println("50 reais notes: " + notes50);
        System.out.println("10 reais notes: " + notes10);
        System.out.println("5 reais notes: " + notes5);
        System.out.println("1 real notes: " + notes1);
        
        sc.close();
        
    }
}
