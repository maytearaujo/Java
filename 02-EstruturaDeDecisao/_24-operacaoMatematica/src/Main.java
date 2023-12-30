/*Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da
 operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, result = 0;
        char op;
        String parImpar, positivoNegativo, inteiroDecimal;

        System.out.print("Informe o 1º número: ");
        num1 = sc.nextFloat();

        System.out.print("Informe o 2º número: ");
        num2 = sc.nextFloat();

        System.out.print("Qual operação deseja realizar ( + - * /: )");
        op = sc.next().charAt(0);

        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 + num2;
                break;
            case '*':
                result = num1 + num2;
                break;
            case '/':
                result = num1 + num2;
                break;
            default:
                System.out.println("Valor Inválido");
        }


        if (result % 2 == 0)
            parImpar = "Par";
        else
            parImpar = "Impar";


        if (result > 0)
            positivoNegativo = "Positivo";
        else if (result < 0)
            positivoNegativo = "Negativo";
        else
            positivoNegativo = "Neutro";


        if (Math.floor(result) != result)
            inteiroDecimal = "Decimal";
        else
            inteiroDecimal = "Inteiro";


        System.out.printf("%f + %f = %.2f%nO resultado é um número %s, %s e %s", num1, num2, result, parImpar, positivoNegativo, inteiroDecimal);
    }
}