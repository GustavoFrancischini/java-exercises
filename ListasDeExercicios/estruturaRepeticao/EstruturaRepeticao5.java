package estruturaRepeticao;

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
// Valide a entrada e permita repetir a operação.

import java.util.*;

public class EstruturaRepeticao5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a população do país A: ");
        double countryA = sc.nextDouble();
        System.out.println("Informe a população do país B: ");
        double countryB = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país A (em %): ");
        double growthRateA = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país B (em %): ");
        double growthRateB = sc.nextDouble();

        int years = 0;

        if (countryA < countryB) {
            while (countryA < countryB) {
                countryA += countryA * growthRateA / 100;
                countryB += countryB * growthRateB / 100;
                years++;
            }
            System.out.printf("O país A vai precisar de %d anos para ultrapassar o país B.%n", years);
        } else if (countryB < countryA) {
            while (countryB < countryA) {
                countryA += countryA * growthRateA / 100;
                countryB += countryB * growthRateB / 100;
                years++;
            }
            System.out.printf("O país B vai precisar de %d anos para ultrapassar o país A.%n", years);
        } else {
            System.out.println("A população dos países é igual.");
        }

        sc.close();
    }
}
