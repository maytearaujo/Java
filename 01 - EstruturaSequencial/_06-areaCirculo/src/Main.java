/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float raio, area;

        System.out.print("Informe o raio do círculo: ");
        raio = sc.nextFloat();

        area = (float) 3.14 * (raio * raio);

        System.out.println("A área do círculo é: " + area);
    }
}