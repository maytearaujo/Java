/*Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        float media;

        System.out.print("Informe a 1ª nota: ");
        num1 = sc.nextInt();

        System.out.print("Informe a 2ª nota: ");
        num2 = sc.nextInt();

        System.out.print("Informe a 3ª nota: ");
        num3 = sc.nextInt();

        System.out.print("Informe a 4ª nota: ");
        num4 = sc.nextInt();

        media = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A média de notas é: " + media);
    }
}