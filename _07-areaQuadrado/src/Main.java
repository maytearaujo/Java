/*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  texto = new Scanner(System.in);
        float area, lado, dobro;

        System.out.print("Informe o valor do lado do quadrado: ");
        lado = texto.nextFloat();

        area = lado * lado;
        dobro = area * 2;

        System.out.println("O dobro da área do quadrado é: " + dobro);
    }
}