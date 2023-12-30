/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                            Até 5 Kg           Acima de 5 Kg
        Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
        Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
        receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg)
        de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float quantMorangos, quantMacas, quantidadeFrutas, precoMorango = 0, precoMaca = 0, valorPagar;

        System.out.print("Informe a quantidade (em Kg) de morangos: ");
        quantMorangos = sc.nextFloat();

        System.out.print("Informe a quantidade (em Kg) de maças: ");
        quantMacas = sc.nextFloat();

        quantidadeFrutas = quantMorangos + quantMacas;

        if (quantMorangos > 0 && quantMorangos <= 5)
            precoMorango = quantMorangos * 2.50f;
        else if (quantMorangos > 5)
            precoMorango = quantMorangos * 2.20f;


        if (quantMacas > 0 && quantMacas <= 5)
            precoMaca = quantMacas * 1.80f;
        else if(quantMacas > 5)
            precoMaca = quantMacas * 1.50f;

        valorPagar = precoMorango + precoMaca;
        if (quantidadeFrutas > 8 && valorPagar > 25 )
            valorPagar = valorPagar - 0.1f;


        System.out.println("Valor a ser pago: " + valorPagar);
    }
}