package estruturaSequencial;

/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
- salário bruto.
- quanto pagou ao INSS.
- quanto pagou ao sindicato.
- o salário líquido.

calcule os descontos e o salário líquido, conforme a tabela abaixo: 
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. */

import java.util.*;

public class EstruturaSequencial14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double salarioPorHora = sc.nextDouble();
        System.out.println("E o número de horas trabalhadas no mês? ");
        double horasMensaisTrabalhadas = sc.nextDouble();

        double salarioBruto = salarioPorHora * horasMensaisTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = inss + impostoDeRenda + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Seu salário bruto é R$ %.2f, o imposto de renda sobre seu salário é de R$ %.2f, as taxas do sindicato e do INSS são R$ %.2f e R$ %.2f, respectivamente. %n", salarioBruto, impostoDeRenda, sindicato, inss);
        System.out.printf("Seu salário líquido após os descontos é: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}


