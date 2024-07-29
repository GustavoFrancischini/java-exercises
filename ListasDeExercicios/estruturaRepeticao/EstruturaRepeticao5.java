package estruturaRepeticao;

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
// Valide a entrada e permita repetir a operação.

import java.util.*;

public class EstruturaRepeticao5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the population of country A: ");
        double countryA = sc.nextDouble();
        System.out.println("Enter the growth rate of country A: ");
        double rateA = sc.nextDouble();
        System.out.println("Enter the population of country B: ");
        double countryB = sc.nextDouble();
        System.out.println("Enter the growth rate of country B: ");
        double rateB = sc.nextDouble();
        
        int year = 0;
        
        if(countryA < 0 || countryB < 0 || rateA < 0 || rateB < 0) {
            System.out.println("Enter valid values.");
            System.exit(0);
        }
        if (countryA < countryB && rateA > rateB) {
            while (countryA < countryB) {
                year += 1;
                countryA += (rateA / 100) * countryA;
                countryB += (rateB / 100) * countryB;
            }
            System.out.printf("It took %d years for the population of country A to surpass country B.\n", year);
        } else if (countryA > countryB && rateA < rateB) {
            while (countryA > countryB) {
                year += 1;
                countryA += (rateA / 100) * countryA;
                countryB += (rateB / 100) * countryB;
            }
            System.out.printf("It took %d years for the population of country B to surpass country A.\n", year);
        } else {
            System.out.println("The countries have the same population, the same growth rate, or the country with the smaller population has a lower growth rate. \nTherefore, the population of the country with the smaller population will never surpass the other country's.");
        }
        
        sc.close();
    }
}
