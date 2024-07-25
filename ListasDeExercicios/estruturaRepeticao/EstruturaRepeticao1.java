package estruturaRepeticao;

// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.*;

public class EstruturaRepeticao1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        int nota = sc.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Digite somente notas válidas.");
            nota = sc.nextInt();
        }

        System.out.println("Nota validada.");

    }
}
