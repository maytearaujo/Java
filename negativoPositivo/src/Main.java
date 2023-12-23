/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        System.out.println(num >= 0 ? "Positivo":"Negativo");
    }
}