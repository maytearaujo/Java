/*Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a
quantidade de números impares.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, num, pares = 0, impares = 0;

        while (i <= 10){
            System.out.print("Informe o " + i + "º número: ");
            num = sc.nextInt();

            if (num % 2 == 0)
                pares++;
            else
                impares++;

            i++;
        }
        System.out.printf("Foram digitados %d números pares e %d impares", pares, impares);

    }
}