/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        if (num > 0)
            System.out.println("Positivo");
        else if (num < 0) {
            System.out.println("Negativo");
        }else
            System.out.println("Neutro");
    }
}