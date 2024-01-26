/*A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 1, f1 = 1, f2 = 0, fi = 1;

        System.out.print("Digite um número para criarmos uma sequência Fibonacci: ");
        num = sc.nextInt();

        while (i <= num ){
            fi = f1 +f2;
            f1 = f2;
            f2 = fi;
            i++;
            System.out.print(fi + " ");

        }
    }
}
