package estruturaSequencial;

/* Tendo como dados de entrada a altura de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */

import java.util.*;

public class EstruturaSequencial11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        double calculation = (72.7 * height) - 58;
        System.out.printf("Your ideal weight is: %.2f", calculation);
        sc.close();

    }
}