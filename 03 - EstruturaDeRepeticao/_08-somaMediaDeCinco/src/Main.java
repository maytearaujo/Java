/*Faça um programa que leia 5 números e informe a soma e a média dos números.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, media = 0, numeros[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Informe o " + (i+1) +" número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++){
            soma = soma + numeros[i];
        }
        media = soma / numeros.length;

        System.out.println("Soma dos números: " + soma);
        System.out.printf("Média dos números %d", media);
    }
}