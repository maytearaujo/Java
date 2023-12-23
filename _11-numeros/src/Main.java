/*
Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
O produto do dobro do primeiro com metade do segundo.
A soma do triplo do primeiro com o terceiro.
O terceiro elevado ao cubo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        float num3, produtoMetade, triplo, cubo;

        System.out.print("Informe o 1º número inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Informe o 2º número inteiro: ");
        num2 = sc.nextInt();

        System.out.print("Informe o 1º número real: ");
        num3 = sc.nextFloat();

        produtoMetade = (num1*2) * (float) (num2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + produtoMetade);

        triplo = (num1 * 3) + num3;
        System.out.println("A soma do triplo do primeiro com o terceiro: " + triplo);

        cubo = num3 * num3 * num3;
        System.out.println("O terceiro elevado ao cubo: " + cubo);
    }
}