package estruturaRepeticao;

/*

Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';

 */

import java.util.*;

public class EstruturaRepeticao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String name;
        while (true) {
            System.out.print("Name (more than 3 characters): ");
            name = sc.nextLine();
            if (name.length() > 3) {
                break;
            } else {
                System.out.println("Name must have more than 3 characters.");
            }
        }
        int age;
        while (true) {
            System.out.print("Age (between 0 and 150): ");
            age = sc.nextInt();
            if (age >= 0 && age <= 150) {
                break;
            } else {
                System.out.println("Age must be between 0 and 150.");
            }
        }
        double salary;
        while (true) {
            System.out.print("Salary (greater than zero): ");
            salary = sc.nextDouble();
            if (salary > 0) {
                break;
            } else {
                System.out.println("Salary must be greater than zero.");
            }
        }
        char gender;
        while (true) {
            System.out.print("Gender (f or m): ");
            gender = sc.next().charAt(0);
            if (gender == 'f' || gender == 'm') {
                break;
            } else {
                System.out.println("Gender must be 'f' or 'm'.");
            }
        }
        char maritalStatus;
        while (true) {
            System.out.print("Marital Status (s, c, v, d): ");
            maritalStatus = sc.next().charAt(0);
            if (maritalStatus == 's' || maritalStatus == 'c' || maritalStatus == 'v' || maritalStatus == 'd') {
                break;
            } else {
                System.out.println("Marital Status must be 's', 'c', 'v' or 'd'.");
            }
        }
        System.out.println("Validated information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
        
        sc.close();
    }
}
