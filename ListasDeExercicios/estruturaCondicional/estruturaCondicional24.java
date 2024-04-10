package estruturaCondicional;

/* 

Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.

*/

import java.util.*;

public class estruturaCondicional24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Escolha a operação (1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão): ");
        int operacao = sc.nextInt();
        
        double resultado = 0;
        String tipoNumero = "";
        
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }
        
        if (resultado % 2 == 0) {
            tipoNumero += "par, ";
        } else {
            tipoNumero += "ímpar, ";
        }
        
        if (resultado >= 0) {
            tipoNumero += "positivo, ";
        } else {
            tipoNumero += "negativo, ";
        }
        
        if (resultado == Math.round(resultado)) {
            tipoNumero += "inteiro.";
        } else {
            tipoNumero += "decimal.";
        }
        
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println("O número resultante é " + tipoNumero);

        sc.close();
    }
}