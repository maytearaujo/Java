/*Faça um Programa que leia três números e mostre o maior deles.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Informe o 1º número: ");
        num1 = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        num2 = sc.nextInt();

        System.out.print("Informe o 3º número: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " é o maior");
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " é o maior");
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " é o maior");
        }
    }
}