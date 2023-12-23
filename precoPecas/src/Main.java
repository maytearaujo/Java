/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float codigoPeca1, numeroPeca1, valorPeca1, precoPeca1, codigoPeca2, numeroPeca2, valorPeca2, precoPeca2;

        System.out.println("Informe o código, número e o preço da peça 1: ");
        codigoPeca1 = sc.nextFloat(); numeroPeca1 = sc.nextFloat(); valorPeca1 = sc.nextFloat();

        System.out.println("Informe o código, número e o preço da peça 2: ");
        codigoPeca2 = sc.nextFloat(); numeroPeca2 = sc.nextFloat(); valorPeca2 = sc.nextFloat();

        precoPeca1 = numeroPeca1 * valorPeca1;
        precoPeca2 = numeroPeca2 * valorPeca2;

        System.out.println("Valor a pagar: " + (precoPeca1 + precoPeca2));
    }
}