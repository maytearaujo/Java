/*Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é
aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, divisivel = 0;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        if (num > 0){
            for (int i = 1; i <= num; ++i) {
                if (num % i == 0){
                    divisivel++;
                }
            }
        }

        if (divisivel == 2){
            System.out.printf("%d é um número primo", num);
        }else if ( divisivel != 2 || num <= 0) {
            System.out.printf("%d não é um número primo", num);
        }
    }
}