/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 Calcule e mostre o total do seu salário no referido mês.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorHora, qtdHorasTrabalhadas, salario;

        System.out.print("Informe o valor da hora: ");
        valorHora = sc.nextFloat();

        System.out.println("Informe a quantidade de horas trabalhadas/mês");
        qtdHorasTrabalhadas = sc.nextFloat();

        salario = valorHora * qtdHorasTrabalhadas;
        System.out.println("Salário Mensal: " + salario);
    }
}