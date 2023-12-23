/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
5% para o sindicato, faça um programa que nos dê: salário bruto. quanto pagou ao INSS. quanto pagou ao sindicato.
o salário líquido. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salarioHora, horasTrabalhadasMes, salarioBruto, salarioLiquido, impostoRenda, inss, sindicato;

        System.out.print("Informe o valor da hora trabalhada: ");
        salarioHora = sc.nextFloat();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadasMes = sc.nextFloat();

        salarioBruto = salarioHora * horasTrabalhadasMes;
        impostoRenda = salarioBruto * 0.11f;
        inss = salarioBruto * 0.08f;
        sindicato = salarioBruto * 0.05f;
        salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);

        System.out.print(
                "\n+ Salário Bruto :     R$ " + salarioBruto +
                        "\n- IR (11%) :          R$ " +impostoRenda +
                        "\n- INSS (8%) :         R$ " +inss +
                        "\n- Sindicato ( 5%) :   R$ " +sindicato +
                        "\n= Salário Liquido :   R$ " + salarioLiquido);
    }
}