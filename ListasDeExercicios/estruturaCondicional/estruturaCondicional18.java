package estruturaCondicional;

/* 

Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

*/

import java.util.*;

public class estruturaCondicional18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = sc.nextLine();

        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean dataValida = true;

        if (mes < 1 || mes > 12 || dia < 1 || ano <= 0) {
            dataValida = false;
        } else {
            int diasNoMes = 31; // Assume 31 dias por padrão
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMes = 30;
            } else if (mes == 2) {
                diasNoMes = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28;
            }
            if (dia > diasNoMes) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }

        sc.close();
    }
}
