/*Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
Altere o programa anterior para mostrar no final a soma dos números.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma = 0, i;

        System.out.print("Informe um número: ");
        num1 = sc.nextInt();

        System.out.print("Informe outro número: ");
        num2 = sc.nextInt();

        if (num1 < num2){
            i = num1;

            do{
                System.out.print(i + " ");
                soma += i;
                i++;
            } while (i <= num2);

        }else if(num1 > num2){
            i = num2;

            while (i <= num1){
                System.out.print(i + " ");
                soma += i;
                i++;
            }

        }else{
            System.out.println("Os números são iguais.");
        }

        System.out.println("\n A soma dos números é: " + soma);

        sc.close();
    }
}