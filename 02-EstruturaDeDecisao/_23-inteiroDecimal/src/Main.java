/*Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, arredondado;

        System.out.print("Informe um número: ");
        num = sc.nextDouble();

        arredondado = Math.floor(num);

        if (num != arredondado)
            System.out.println("Número Decimal " + arredondado);
        else
            System.out.println("Número Inteiro " + num);
    }
}