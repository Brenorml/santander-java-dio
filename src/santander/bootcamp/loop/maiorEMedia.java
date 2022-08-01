package santander.bootcamp.loop;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior) maior = numero;

            count += 1;
        } while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
