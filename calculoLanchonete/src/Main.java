/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

codigo  especificação       preço
1       Cachorro Quente     R$ 4,00
2       X - Salada          R$ 4,50
3       X - Bacon           R$ 5,00
4       Torrada Simples     R$ 2,00
5       Refrigerante        R$ 1,50
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorTotal, preco = 0;
        int codigo, quantidade;

        System.out.print("Informe o código do produto: ");
        codigo = sc.nextInt();

        System.out.print("Informe a quantidade: ");
        quantidade =  sc.nextInt();

        switch (codigo){
            case 1:
                preco = 4.00f;
                break;
            case 2:
                preco = 4.5f;
                break;
            case 3:
                preco = 5.00f;
                break;
            case 4:
                preco = 2.00f;
                break;
            case 5:
                preco = 1.00f;
                break;
            default:
                System.out.println("Valor inválido");
        }

        valorTotal = quantidade * preco;
        System.out.printf("Total á pagar: %.2f", valorTotal);
    }
}