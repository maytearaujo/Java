/* A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja
maior que 500.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, f1 = 1, f2 = 0, fi = 1;

        do {
            fi = f1 +f2;
            f1 = f2;
            f2 = fi;
            i++;
            System.out.print(fi + " ");

        } while ( fi < 501 );
    }
}
