/*Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar
quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo
é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma
nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorSaque, sobra = 0;
        int notas1 = 0, notas5 = 0, notas10 = 0, notas50 = 0, notas100 = 0;

        System.out.print("Para saques o valor mínimo é de 10 reais e o máximo de 600 reais\n" +
                "Qual o valor deseja sacar?: ");
        valorSaque = sc.nextFloat();

        if (valorSaque >= 100) {
            notas100 = (int) Math.floor(valorSaque / 100);
            sobra = valorSaque % 100;
        }

        if (valorSaque >= 50 || sobra >= 50){
            notas50 = (int) Math.floor(sobra / 50);
            sobra = valorSaque % 50;
        }
        if (valorSaque >= 10 || sobra >= 10){
            notas10 = (int) Math.floor(sobra / 10);
            sobra = valorSaque % 10;
        }
        if (valorSaque >= 5 || sobra >= 5){
            notas5 = (int) Math.floor(sobra / 5);
            sobra = valorSaque % 5;
        }
        if (valorSaque >= 1 || sobra >= 1){
            notas1 = (int) Math.floor(sobra / 1);
            sobra = valorSaque % 1;
        }
        System.out.printf("Serão fornecidas:%n %d notas de R$ 100,00" +
                "%n %d notas de R$ 50,00" +
                "%n %d notas de R$ 10,00" +
                "%n %d notas de R$ 5,00" +
                "%n %d notas de R$ 1,00" , notas100, notas50, notas10, notas5, notas1);

    }
}