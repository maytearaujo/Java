/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a 
decisão é sempre pelo mais barato. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preco1, preco2, preco3;

        System.out.print("Informe o 1º preco: ");
        preco1 = sc.nextFloat();

        System.out.print("Informe o 2º preco: ");
        preco2 = sc.nextFloat();

        System.out.print("Informe o 3º preco: ");
        preco3 = sc.nextFloat();

        if (preco1 < preco2 && preco1 < preco3)
            System.out.println(preco1 + " é o menor");
        else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println(preco2 + " é o menor");
        }
        else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println(preco3 + " é o menor");
        }    }
}