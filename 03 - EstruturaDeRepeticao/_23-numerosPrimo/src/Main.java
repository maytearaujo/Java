/*Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count, divisoes = 0;
        ArrayList<Integer> arrayPrimos = new ArrayList<>();

        System.out.print("Informe um número positivo: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    divisoes++;
                }
            }

            if (count == 2){
                arrayPrimos.add(i);
            }
        }

        System.out.printf("Os números primos entre 1 e %d são ", num);
        for (int i = 0; i < arrayPrimos.size(); i++) {
            System.out.print(arrayPrimos.get(i) + ", ");
        }
        System.out.printf("Foram realizadas %d divisões para encontrarmos os números primos.", divisoes);
    }
}