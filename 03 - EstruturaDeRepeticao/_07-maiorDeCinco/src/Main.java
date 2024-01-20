/*Faça um programa que leia 5 números e informe o maior número.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior, numeros[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Informe o " + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
        }

        maior = numeros[0];

        for (int i = 1; i < 5; i++){
           if (numeros[i] > maior)
               maior = numeros[i];
        }

        System.out.println("O maior número digitado é: " + maior);
    }
}