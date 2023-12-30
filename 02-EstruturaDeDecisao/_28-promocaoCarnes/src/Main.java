/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo
usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de
pagamento, valor do desconto e valor a pagar.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoCarne;
        int quantCarne, formaPagamento;
        float precoCarneTotal = 0, precoCarne = 0, valorDesconto = 0;


        System.out.print("Informe o tipo de carne: ");
        tipoCarne = sc.next();

        System.out.print("Informe a quantidade de carne: ");
        quantCarne = sc.nextInt();

        switch (tipoCarne){
            case "File Duplo":
                if (quantCarne > 0 && quantCarne <= 5)
                    precoCarneTotal = quantCarne * 4.90f;
                else if (quantCarne > 5)
                    precoCarneTotal = quantCarne * 5.80f;
                break;

            case "Alcatra":
                if (quantCarne > 0 && quantCarne <= 5)
                    precoCarneTotal = quantCarne * 5.90f;
                else if (quantCarne > 5)
                    precoCarneTotal = quantCarne * 6.80f;
                break;

            case "Picanha":
                if (quantCarne > 0 && quantCarne <= 5)
                    precoCarneTotal = quantCarne * 6.90f;
                else if (quantCarne > 5)
                    precoCarneTotal = quantCarne * 7.80f;
                break;

            default:
                System.out.println("Valor Inválido");
        }

        System.out.println("Qual a forma de pagamento: \n1- Cartão Tabajara\n2 - Cartão de Crédito\n3 - Débito\n4 - Dinheiro");
        formaPagamento = sc.nextInt();

        if (formaPagamento == 1) {
            valorDesconto = precoCarneTotal * 0.05f;
            precoCarne = precoCarneTotal - valorDesconto;
        }else
            precoCarne = precoCarneTotal;



        System.out.println("Hipermercado Tabajara");
        System.out.println("Cupom Fiscal");
        System.out.printf("Tipo de Carne:           %s%n" +
                          "Quantidade de carne:     %d%n" +
                          "Preço total:             %.2f%n" +
                          "Forma de Pagamento:      %s%n" +
                         "Valor do desconto:        %.2f%n" +
                         "Valor a pagar:            %.2f%n", tipoCarne, quantCarne, precoCarneTotal, formaPagamento, valorDesconto, precoCarne);
    }
}