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
        System.out.println("How much do you earn per hour? ");
        double hourlyWage = sc.nextDouble();
        System.out.println("And the number of hours worked per month? ");
        double monthlyHoursWorked = sc.nextDouble();
        
        double grossSalary = hourlyWage * monthlyHoursWorked;
        double incomeTax = grossSalary * 0.11;
        double inss = grossSalary * 0.08;
        double unionFee = grossSalary * 0.05;
        double deductions = inss + incomeTax + unionFee;
        double netSalary = grossSalary - deductions;
        
        System.out.printf("Your gross salary is $ %.2f, the income tax on your salary is $ %.2f, the union and INSS fees are $ %.2f and $ %.2f, respectively. %n", grossSalary, incomeTax, unionFee, inss);
        System.out.printf("Your net salary after deductions is: $ %.2f\n", netSalary);
        
        sc.close();        
    }
}


