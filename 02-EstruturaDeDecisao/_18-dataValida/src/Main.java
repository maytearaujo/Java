/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Informe o dia: ");
        dia = sc.nextInt();

        System.out.print("Informe o mês: ");
        mes = sc.nextInt();

        System.out.print("Informe o ano: ");
        ano = sc.nextInt();

        if( (dia >=1 && dia <= 31) && (mes >=1 && mes <= 12) && (ano >= 1 ))
            System.out.printf("%d/%d/%d é uma data válida", dia, mes, ano);
        else
            System.out.println("Data Inválida");
    }

}