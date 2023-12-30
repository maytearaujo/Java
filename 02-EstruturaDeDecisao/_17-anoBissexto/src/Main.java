
/*Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.print("Informe um ano: ");
        ano = sc.nextInt();

        if ((( ano % 4 == 0 ) && ( ano % 100 != 0 )) || ( ano % 400 == 0 ))
            System.out.println("Bissexto");
        else
            System.out.println("Não é Bissexto");
    }
}