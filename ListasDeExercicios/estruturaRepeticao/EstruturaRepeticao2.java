package estruturaRepeticao;

// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.*;

public class EstruturaRepeticao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        String user = sc.next();
        System.out.println("Informe a senha: ");
        String senha = sc.next();


        while(user.equals(senha)) {
            System.out.println("A senha não pode ser igual ao nome de usuário. Digite outra: ");
            senha = sc.next();
        }

        System.out.println("Conta criada!");

    }
}
