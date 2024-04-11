package estruturaCondicional;

/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e 
lhe contrataram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
baseado no salário atual:

salários até R$ 280,00 (incluindo): aumento de 20%
salários entre R$ 280,00 e R$ 700,00: aumento de 15%
salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
salários de R$ 1500,00 em diante: aumento de 5% 

Após o aumento ser realizado, informe na tela:
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- e o novo salário, após o aumento. */

import java.util.*;

public class estruturaCondicional11 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    double salary = sc.nextDouble();
    double newSalary;
    String percentage;
    double increase;

    if (salary <= 280) {
      newSalary = salary * 1.20;
      percentage = "20%";
    }
    else if (salary <= 700){
      newSalary = salary * 1.15;
      percentage = "15%";
    }
    else if (salary <= 1500){
      newSalary = salary * 1.10;
      percentage = "10%";
    }
    else {
      newSalary = salary * 1.05;
      percentage = "5%";
    }

    increase = newSalary - salary;

    // original salary
    System.out.printf("Your initial salary: $%.2f%n", salary);
    // percentage increase applied
    System.out.println("Percentage increase applied: " + percentage);
    // the value of the increase
    System.out.printf("Value of the increase: $%.2f%n", increase);
    // and the new salary after the increase
    System.out.printf("New salary: $%.2f", newSalary);

    sc.close(); 
	}
}