/*Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
Dica: utilize o operador módulo (resto da divisão).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        if (num  % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}