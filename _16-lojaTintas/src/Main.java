/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas
de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, litros, latas, preco;

        System.out.print("Informe o tamanho da área a ser pintada em m²: ");
        area = sc.nextFloat();

        litros = area / 3;
        litros = (int) Math.ceil(litros);

        latas = litros / 18;
        latas = (int) Math.ceil(latas);
        preco = latas * 80;

        System.out.printf("Comprar %.0f latas no total de R$ %.2f", latas, preco);
    }
}