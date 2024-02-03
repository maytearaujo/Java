
/*Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto
em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdCd, valorCadaCd, valorTotal = 0;

        System.out.print("Informe a quantidade de CDs: ");
        qtdCd = sc.nextInt();

        for (int i = 0; i < qtdCd; i++) {
            System.out.print("Informe o valor do " + (i+1) +"º CD: ");
            valorCadaCd = sc.nextInt();

            valorTotal += valorCadaCd;
        }

        System.out.print("\n Valor total investido R$ " + valorTotal);
    }
}