/*Faça um Programa que peça dois números e imprima o maior deles.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Informe o 1º número: ");
        num1 = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " é o maior número");
        else if (num2 > num1) {
            System.out.println(num2 + " é o maior número");
        }else
            System.out.println("Os números são iguais");
    }
}