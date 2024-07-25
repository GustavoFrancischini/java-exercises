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

        String nome;
        while (true) {
            System.out.print("Nome (maior que 3 caracteres): ");
            nome = sc.nextLine();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Nome deve ter mais que 3 caracteres.");
            }
        }
        int idade;
        while (true) {
            System.out.print("Idade (entre 0 e 150): ");
            idade = sc.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Idade deve ser entre 0 e 150.");
            }
        }
        double salario;
        while (true) {
            System.out.print("Salário (maior que zero): ");
            salario = sc.nextDouble();
            if (salario > 0) {
                break;
            } else {
                System.out.println("Salário deve ser maior que zero.");
            }
        }
        char sexo;
        while (true) {
            System.out.print("Sexo (f ou m): ");
            sexo = sc.next().charAt(0);
            if (sexo == 'f' || sexo == 'm') {
                break;
            } else {
                System.out.println("Sexo deve ser 'f' ou 'm'.");
            }
        }
        char estadoCivil;
        while (true) {
            System.out.print("Estado Civil (s, c, v, d): ");
            estadoCivil = sc.next().charAt(0);
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                break;
            } else {
                System.out.println("Estado Civil deve ser 's', 'c', 'v' ou 'd'.");
            }
        }
        System.out.println("Informações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        sc.close();
    }
}
