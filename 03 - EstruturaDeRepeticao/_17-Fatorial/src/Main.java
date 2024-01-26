/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, fatorial = 1;

        System.out.print("Informe um número para cálculo do fatorial: ");
        num =  sc.nextInt();

        i = num;
        while(i > 0){
           fatorial *= i;
           i--;
        }

        System.out.printf("O fatorial de %d é %d", num, fatorial);
    }
}