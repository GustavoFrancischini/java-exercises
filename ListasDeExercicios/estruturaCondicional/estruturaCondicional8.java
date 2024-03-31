package estruturaCondicional;

/* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato. */

import java.util.*;

public class estruturaCondicional8 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro produto: ");
        double produto1 = sc.nextDouble();
        System.out.println("Informe o valor do segundo produto: ");
        double produto2 = sc.nextDouble();
        System.out.println("Informe o valor do terceiro produto: ");
        double produto3 = sc.nextDouble();

        if(produto1 < produto2 && produto1 < produto3){
            System.out.println("Compre o primeiro produto, pois é o mais barato.");
        }
        else if(produto2 < produto1 && produto2 < produto3){
            System.out.println("Compre o segundo produto, pois é o mais barato.");
        }
        else if(produto3 < produto1 && produto3 < produto2){
            System.out.println("Compre o terceiro produto, pois é o mais barato.");
        }
        else if (produto1 == produto2 && produto1 == produto3) {
            System.out.println("Todos os produtos possuem o mesmo valor.");
        }
        else {
            System.out.println("Dois ou mais produtos possuem o mesmo valor.");
        }

        sc.close(); 
	}
}

