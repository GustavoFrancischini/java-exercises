package estruturaCondicional;

import java.util.*;

// Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 

public class estruturaCondicional4 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = sc.next().toLowerCase().charAt(0);

         List<Character> lowercaseConsonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
         List<Character> lowercaseVowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String result;

        if (lowercaseConsonants.contains(letter)){
            result = "The letter entered is a consonant";
        }
        else if (lowercaseVowels.contains(letter)) {
            result = "The letter entered is a vowel";
        }
        else{
            result = "Enter only letters of the alphabet";
        }

        System.out.println(result);
    sc.close(); 

	}
}
