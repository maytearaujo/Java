/*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

- Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os
demais valores, sendo encerrado;
- Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
- Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
- Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a, b, c, d, x1, x2;

        System.out.println("Vamos calcular uma equação de segundo grau");
        System.out.print("Informe o valor de a: ");
        a = sc.nextFloat();

        if (a == 0){
            System.out.print("Infelizmente não temos uma equação de segundo grau.");
        }else{
            System.out.print("Informe o valor de b: ");
            b = sc.nextFloat();

            System.out.print("Informe o valor de b: ");
            c = sc.nextFloat();

            d = (b * b) - 4 * a * c;

            if (d < 0)
                System.out.println("Equação não possui raizes reais");
            else if (d == 0)
                System.out.println("Equação possui apenas uma raiz real");
            else if (d > 0)
                System.out.println("Equação possui duas raiz reais");

            /*x1 = (float) ( -(b) + Math.sqrt(d) ) / (2 * a);
            x2 = (float) ( -(b) - Math.sqrt(d) ) / (2 * a);*/

        }
    }
}