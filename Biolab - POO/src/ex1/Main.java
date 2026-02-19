package ex1;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do Animal");
        String nome = sc.next();
        IO.println("Digite a idade");
        int idade = sc.nextInt();
        IO.println("Digite a raça do animal");
        String raca = sc.next();
        IO.println("Digite o sexo do Animal");
        String sexo = sc.next();
        IO.println("Digite a cor");
        String cor = sc.next();

        cachorro cachorro = new cachorro(nome, idade, sexo, raca);

        IO.println(cachorro);


    }
}
