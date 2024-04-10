package estruturaCondicional;

/* 

Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

1 - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau 
e o programa não deve fazer pedir os demais valores, sendo encerrado;
2 - Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
3 - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
4 - Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

*/

import java.util.*;

public class estruturaCondicional16 {
    public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double valor1 = sc.nextDouble();
        if (valor1 == 0){
            System.out.println("A equação não é do segundo grau.");
            System.exit(0);
        }
        System.out.println("Informe o segundo valor: ");
        double valor2 = sc.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        double valor3 = sc.nextDouble();

        double x = 1;
        String print = "";

        double delta = (valor1 * Math.pow(x, 2)) + (valor2 * x) + valor3;

        if (delta < 0){
            print = "A equação não possui raízes reais.";
        }
        else if (delta == 0) {
            print = "A equação possui apenas uma raíz real.";
        }
        else{
            print = "A equação possui duas raiz reais.";
        }

        System.out.println(print);

        sc.close();
        }
}