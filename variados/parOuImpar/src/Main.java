/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        System.out.println(num % 2 == 0 ? "Par": "Impar");

    }
}