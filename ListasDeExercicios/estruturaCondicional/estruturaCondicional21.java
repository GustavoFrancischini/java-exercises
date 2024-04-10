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
        System.out.println("Qual valor do saque? ");
        int saque = sc.nextInt();
        if (saque < 10 || saque > 600) {
            System.out.println("Valor mínimo: 10 reais e Valor máximo: 600 reais. Tente novamente.");
            System.exit(0);
        }

        
        sc.close();
        }
}