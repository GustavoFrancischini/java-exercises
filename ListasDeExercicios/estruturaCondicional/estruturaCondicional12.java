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
        System.out.println("Enter your hourly wage: ");
        int hourlySalary = sc.nextInt();
        System.out.println("Enter how many hours you worked in the month: ");
        int monthlyHours = sc.nextInt();
        int salary = monthlyHours * hourlySalary;
        double incomeTax;
        String taxRate;
        
        if(salary <= 900) {
                incomeTax = 0.0;
                taxRate = "(EXEMPT)";
        }
        else if(salary <= 1500) {
                incomeTax = salary * 0.05;
                taxRate = "(5%)";
        }
        else if(salary <= 2500) {
                incomeTax = salary * 0.10;
                taxRate = "(10%)";
        }
        else{
                incomeTax = salary * 0.20;
                taxRate = "(20%)";
        }
        
        double INSSDiscount = salary * 0.05;
        double FGTSDiscount = salary * 0.11;
        double unionFee = salary * 0.03;
        double netSalary = salary - incomeTax - INSSDiscount - unionFee;
        
        System.out.printf("Gross salary: %d %n", salary);
        System.out.printf("Income tax %s: %.2f %n", taxRate, incomeTax);
        System.out.printf("INSS (5%%): %.2f%n", INSSDiscount);
        System.out.printf("FGTS (11%%): %.2f%n", FGTSDiscount);
        System.out.printf("Union fee (3%%): %.2f %n", unionFee);
        System.out.printf("Net salary: %.2f ", netSalary);
        
        sc.close(); 
        }
}