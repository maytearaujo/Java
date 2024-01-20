/*Ler um número inteiro N e calcular todos os seus divisores.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        System.out.printf("Divisores de %d: ", num);
        for (int i = 1; i <= num; i++ ){
            if ( num % i == 0)
                System.out.printf(" %d", i);
        }
    }
}