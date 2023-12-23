/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, pesoIdeal;

        System.out.print("Informe sua altura: ");
        altura = sc.nextFloat();
        pesoIdeal = (float) (72.7 * altura) - 58;
        System.out.println("Peso ideal: " + pesoIdeal);

    }
}