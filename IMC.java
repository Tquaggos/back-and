package aula2;

import java.util.Scanner;

public class IMC {
    static void main() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sr.next();

        System.out.println("Digite seu peso");
        Double peso = sr.nextDouble();

        System.out.println("Digit seu altura");
        Double altura = sr.nextDouble();

        System.out.println("Digite sua idade");
        int idade = sr.nextInt();
        
        System.out.println("Seu IMC é:");
        System.out.println(peso/(altura*altura));
    }
}
