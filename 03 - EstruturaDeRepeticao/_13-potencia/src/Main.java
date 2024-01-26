/*Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, expoente, i = 1, potencia = 1;

        System.out.print("Informe a base: ");
        base = sc.nextInt();

        System.out.print("Informe o expoente: ");
        expoente = sc.nextInt();

        while(i <= expoente){
            potencia*= base;
            i++;
        }
        System.out.printf("%d elevado a %d é igual a %d", base, expoente, potencia);
    }
}