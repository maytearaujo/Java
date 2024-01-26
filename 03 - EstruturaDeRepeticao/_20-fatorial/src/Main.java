/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o
fatorial a números inteiros positivos e menores que 16 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, i, fatorial;

        while ( num >= 0 && num < 16) {
            fatorial = 1;

            System.out.print("Informe um número para cálculo do fatorial: ");
            num = sc.nextInt();

            i = num;
            if ( num >= 0 && num < 16) {
                while (i > 0) {
                    fatorial *= i;
                    i--;
                }

                System.out.printf("O fatorial de %d é %d%n", num, fatorial);
            }
        }
    }
}