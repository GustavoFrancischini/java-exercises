package estruturaSequencial;

/* Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade 
de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando 
este link (em minutos). */

import java.util.*;

public class EstruturaSequencial17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the file to download (in MB):");
        double fileSizeMB = sc.nextDouble();

        System.out.println("Enter the speed of the Internet link (in Mbps):");
        double internetSpeedMbps = sc.nextDouble();

        double internetSpeedMBps = internetSpeedMbps / 8;
        double downloadTimeSeconds = fileSizeMB / internetSpeedMBps;
        double downloadTimeMinutes = downloadTimeSeconds / 60;

        System.out.printf("The approximate download time for the file is %.2f minutes.%n", downloadTimeMinutes);
        sc.close();
    }

}
