/*Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele
que é divisível somente por ele mesmo e por 1.

Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        ArrayList<Integer> numerosDivisiveis = new ArrayList<>();

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            if ( num % i == 0 ) {
                numerosDivisiveis.add(i);
                count++;
            }
        }

        if (count > 2){
            System.out.printf("%d não é um número primo e é divisível por ", num);
            for (int i = 0; i < numerosDivisiveis.size(); i++)
                System.out.print(numerosDivisiveis.get(i) + ", ");
        }
        else
            System.out.printf("%d é um número primo", num);
    }
}