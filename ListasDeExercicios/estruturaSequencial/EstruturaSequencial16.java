package estruturaSequencial;

/* Faça um Programa para uma loja de tintas. 

O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é 
vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. 
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias. */

import java.util.*;

public class EstruturaSequencial16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size in square meters of the area to be painted:");
        double areaToBePainted = sc.nextDouble();

        double coveragePerLiter = 6.0;
        double extraCoverageFactor = 1.1;
        double litersNeeded = areaToBePainted / coveragePerLiter * extraCoverageFactor;

        int cansNeeded = (int) Math.ceil(litersNeeded / 18.0);
        int gallonsNeeded = (int) Math.ceil(litersNeeded / 3.6);
        
        double costCans = cansNeeded * 80.0;
        double costGallons = gallonsNeeded * 25.0;
        
        int cansNeededForCombo = (int) Math.ceil(litersNeeded / 18.0);
        int gallonsNeededForCombo = (int) Math.ceil((litersNeeded % 18.0) / 3.6);
        double costCombo = cansNeededForCombo * 80.0 + gallonsNeededForCombo * 25.0;

        System.out.println("Number of cans needed: " + cansNeeded + " Total cost for cans: R$ " + costCans);
        System.out.println("Number of gallons needed: " + gallonsNeeded + " Total cost for gallons: R$ " + costGallons);
        System.out.println("Number of cans needed for combination: " + cansNeededForCombo + ", Number of gallons needed for combination: " + gallonsNeededForCombo + " Total cost for combination: R$ " + costCombo);

        sc.close();
    }

}
