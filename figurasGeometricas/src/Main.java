/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.print("Informe os valores para A, B e C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTrianguloRetangulo = (a * c) / 2;
        areaCirculo = 3.14 * (c * c);
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf("Área do triângulo retângulo: %.2f %n" +
                "Área do círculo: %.2f %n" +
                "Área do trapézio: %.2f %n" +
                "Área do quadrado: %.2f %n" +
                "Área do retângulo: %.2f %n", areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        //System.out.printf("Área do triângulo retângulo: %d%n" +
        //                "Área do círculo: %d\n" +
        //                "Área do trapézio: %d\n" +
        //                "Área do quadrado: %d\n" +
        //                "Área do retângulo: %d", areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
    }
}