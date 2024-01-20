/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que
a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o
número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento.*/

public class Main {
    public static void main(String[] args) {

        float habitantesPaisA = 80000,  habitantesPaisB = 200000, anos = 0;
        float  percentTaxaAnualPaisA = 0.03f, percentTaxaAnualPaisB = 0.15f;

        while (habitantesPaisA < habitantesPaisB){
            habitantesPaisA = habitantesPaisA + percentTaxaAnualPaisA;
            anos++;
        }

        System.out.printf("O país A alcançara o país B em %.0f anos", anos);
    }
}