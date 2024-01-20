/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i);
            System.out.print(" " + i * i);
            System.out.print(" " + i * i * i+"\n");
        }
    }
}