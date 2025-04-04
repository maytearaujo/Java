import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120.
A saída deve ser conforme o exemplo abaixo:
Fatorial de: 5
5! =  5 . 4 . 3 . 2 . 1 = 120*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, total = 1;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();

        System.out.print(numero +"! = ");

        for (int i = numero; i >= 1; i--){
            total *= i;
            System.out.print(i + " . ");
        }
        System.out.print(" = " + total + "\n");
    }
}