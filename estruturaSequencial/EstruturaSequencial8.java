package estruturaSequencial;

/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês. */

import java.util.*;

public class EstruturaSequencial8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How much do you earn per hour? ");
		double hourlyWage = sc.nextDouble();
		System.out.println("And how many hours do you work per month? ");
		double monthlyWorkedHours = sc.nextDouble();
		double monthlySalary = hourlyWage * monthlyWorkedHours;
		System.out.printf("Your monthly salary is $ %.2f", monthlySalary);
		sc.close();

	}

}
