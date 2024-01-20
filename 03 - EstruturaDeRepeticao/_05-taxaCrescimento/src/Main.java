/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a
entrada e permita repetir a operação.

Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que
a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o
número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento.*/

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float habitantesPaisA, habitantesPaisB, anos = 0;
        float  percentTaxaAnualPaisA, percentTaxaAnualPaisB;
        int finalizar = 1;

        do {
            System.out.print("Informe a quantidade de habitantes do país A: ");
            habitantesPaisA = sc.nextFloat();

            System.out.print("Informe a taxa de crescimento inicial do país A: ");
            percentTaxaAnualPaisA = sc.nextFloat();

            System.out.print("Informe a quantidade de habitantes do país B: ");
            habitantesPaisB = sc.nextFloat();

            System.out.print("Informe a taxa de crescimento inicial do país B: ");
            percentTaxaAnualPaisB = sc.nextFloat();

            percentTaxaAnualPaisA = percentTaxaAnualPaisA / 100;
            percentTaxaAnualPaisB = percentTaxaAnualPaisB / 100;

            while (habitantesPaisA < habitantesPaisB) {
                habitantesPaisA = habitantesPaisA + percentTaxaAnualPaisA;
                anos++;
            }

            System.out.printf("São necessário %.2f anos para que a população do país A ultrapasse ou iguale a população do país B%n", anos);
            System.out.println("Para repetir digite 1 | Para finalizar digite 0");

            finalizar = sc.nextInt();
        }while ( finalizar == 1);
    }
}