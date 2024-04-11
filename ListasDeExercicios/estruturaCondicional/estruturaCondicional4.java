package estruturaCondicional;

import java.util.*;

// Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 

public class estruturaCondicional4 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
         // Lista de consoantes em minúsculas
         List<Character> consoantesMinusculas = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
         List<Character> vogaisMinusculas = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String resultado = "";

        if (consoantesMinusculas.contains(letra)){
            resultado = "A letra digitada é uma consoante";
        }
        else if (vogaisMinusculas.contains(letra)) {
            resultado = "A letra digitada é uma vogal";
        }
        else{
            resultado = "Digite somente letras do alfabeto";
        }

        System.out.println(resultado);
        
    sc.close(); 
	}
}
