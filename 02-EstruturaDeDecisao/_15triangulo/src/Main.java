/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float lado1, lado2, lado3;

        System.out.print("Informe os três lados do triângulo: ");
        lado1 = sc.nextFloat(); lado2 = sc.nextFloat(); lado3 = sc.nextFloat();

        if( ( lado1 + lado2  > lado3) || lado2 + lado3 > lado1 || lado1 + lado3 > lado2) {
            System.out.print("Temos um ");
            if ( lado1 == lado2  && lado1 == lado3)
                System.out.print(" Triângulo Equilátero");
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
                System.out.print(" Triângulo Isósceles");
            else  if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
                System.out.print(" Triângulo Escaleno");
        }
        else
            System.out.println("Não temos um triângulo");
    }
}