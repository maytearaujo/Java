
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, mult=0;

        System.out.print("Digite o 1º número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++){
            if ( num1 / i == num2){
                mult = i;
            }
        }

        if (mult != 0)
            System.out.printf("%d e %d são multiplos, pois %d * %d = %d", num1, num2, num2, mult, num1);
        else
            System.out.printf("%d e %d não são números multiplos", num1, num2);

    }
}