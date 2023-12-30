/*Faça um Programa que leia três números e mostre-os em ordem decrescente.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, maior = 0, menor = 0, medio = 0;

        System.out.print("Informe o 1º número: ");
        num1 = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        num2 = sc.nextInt();

        System.out.print("Informe o 3º número: ");
        num3 = sc.nextInt();

        if (num1 !=  num2 && num1 != num3){
            if ((num1 > num2 && num1 > num3) && (num2 < num1 && num2 < num3))  {
                maior = num1;
                medio = num3;
                menor = num2;
            } else if ((num1 > num2 && num1 > num3) && (num3 < num1 && num3 < num2)) {
                maior = num1;
                medio = num2;
                menor = num3;
            } else if ((num2 > num1 && num2 > num3) && (num1 < num2 && num1 < num3))  {
                maior = num2;
                medio = num3;
                menor = num1;
            } else if ((num2 > num1 && num2 > num3) && (num3 < num1 && num3 < num2)) {
                maior = num2;
                medio = num1;
                menor = num3;
            } else if ((num3 > num1 && num3 > num2) && (num1 < num2 && num1 < num3))  {
                maior = num3;
                medio = num2;
                menor = num1;
            } else if ((num3 > num1 && num3 > num2) && (num2 < num1 && num2 < num3)) {
                maior = num3;
                medio = num1;
                menor = num2;
            }

        }

        System.out.println(maior + " " + medio + " " + menor);
    }
}