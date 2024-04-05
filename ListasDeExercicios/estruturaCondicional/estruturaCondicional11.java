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
        System.out.println("Informe seu salário: ");
        double salario = sc.nextDouble();
        double novoSalario;
        String percentual;
        double reajuste;

        if (salario <= 280) {
          novoSalario = salario * 1.20;
          percentual = "20%";
        }
        else if (salario <= 700){
          novoSalario = salario * 1.15;
          percentual = "15%";
        }
        else if (salario <= 1500){
          novoSalario = salario * 1.10;
          percentual = "10%";
        }
        else {
          novoSalario = salario * 1.05;
          percentual = "5%";
        }

        reajuste = novoSalario - salario;

        // salário antes do reajuste
        System.out.printf("Seu salário inicial: R$ %.2f%n", salario);
        // percentual de aumento aplicado
        System.out.println("Percentual de aumento aplicado: " + percentual);
        // o valor do aumento
        System.out.printf("Valor do aumento: R$ %.2f%n", reajuste);
        // e o novo salário, após o aumento
        System.out.printf("Novo salário: R$ %.2f", novoSalario);

        sc.close(); 
	}
}