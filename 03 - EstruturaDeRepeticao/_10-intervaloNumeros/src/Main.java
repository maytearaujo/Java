/*Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("informe um número: ");
        n1 = sc.nextInt();

        System.out.print("informe outro número: ");
        n2 = sc.nextInt();

        if ( n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        }
        else if ( n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                System.out.print(i + " ");
            }
        }
        else
            System.out.print("Os números são iguais");
    }
}