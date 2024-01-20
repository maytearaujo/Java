/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, numIn = 0, numOut = 0;

        System.out.print("Informe um número: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Informe um número: ");
            num = sc.nextInt();

            if (num >= 10 && num <=20)
                numIn++;
            else
                numOut++;
        }

        System.out.printf("Dentre os %d números digitados %d estão no intervalo de 10 a 20 e %d estão fora.", n, numIn, numOut);
    }
}