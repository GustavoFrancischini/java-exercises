package estruturaRepeticao;

// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.*;

public class EstruturaRepeticao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your username: ");
        String user = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        
        while (user.equals(password)) {
            System.out.println("Your password cannot be the same as your username. Please enter your password again: ");
            password = sc.next();
        }
        
        System.out.println("Account successfully created!");
        sc.close();
    }
}
