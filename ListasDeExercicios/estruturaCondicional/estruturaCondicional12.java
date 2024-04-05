package estruturaCondicional;

/* 

Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 

O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 

Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

*/

import java.util.*;

public class estruturaCondicional12 {
    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário por hora: ");
        int salarioPorHora = sc.nextInt();
        System.out.println("Informe quantas horas trabalhou no mês: ");
        int horasMensais = sc.nextInt();
        int salario = horasMensais * salarioPorHora;
        double impostoDeRenda;
        String taxaIR;

        if(salario <= 900) {
                impostoDeRenda = 0.0;
                taxaIR = "(ISENTO)";
        }
        else if(salario <= 1500) {
                impostoDeRenda = salario * 0.05;
                taxaIR = "(5%)";
        }
        else if(salario <= 2500) {
                impostoDeRenda = salario * 0.10;
                taxaIR = "(10%)";
        }
        else{
                impostoDeRenda = salario * 0.20;
                taxaIR = "(20%)";
        }

        double descontoINSS = salario * 0.05;
        double descontoFGTS = salario * 0.11;
        double descontoSindicato = salario * 0.03;
        double salarioLiquido = salario - impostoDeRenda - descontoINSS - descontoSindicato;

        System.out.printf("Salário bruto: %d %n", salario);
        System.out.printf("Imposto de renda %s: %.2f %n", taxaIR, impostoDeRenda);
        System.out.printf("INSS (5%%): %.2f%n", descontoINSS);
        System.out.printf("FGTS (11%%): %.2f%n", descontoFGTS);
        System.out.printf("Sindicato (3%%): %.2f %n", descontoSindicato);
        System.out.printf("Salário Liquido: %.2f ", salarioLiquido);


        sc.close(); 
	}
}