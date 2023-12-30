/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver
o programa que calculará os reajustes.Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5%

Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salarioAtual, aumento,  novoSalario = 0;
        int percetAumento;

        System.out.print("Informe o salário atual: ");
        salarioAtual = sc.nextFloat();

        if (salarioAtual >= 0 && salarioAtual < 280.00) {
            aumento = salarioAtual * 0.20f;
            percetAumento = 20;

        }else if (salarioAtual >= 280.00 && salarioAtual < 700.00) {
            aumento = salarioAtual * 0.15f;
            percetAumento = 15;
        }else if (salarioAtual >= 700.00 && salarioAtual < 1500.00) {
            aumento = salarioAtual * 0.10f;
            percetAumento = 10;
        }else if (salarioAtual >= 1500.00) {
            aumento = salarioAtual * 0.05f;
            percetAumento = 5;
        }else{
            aumento = 0;
            percetAumento = 0;
        }

        novoSalario = salarioAtual + aumento;

        System.out.printf("Salário antes do reajuste: %.2f %nPercentual de aumento: %d %nValor do aumento: %.2f %nnovo salário: %.2f", salarioAtual, percetAumento, aumento, novoSalario);
         /*System.out.printf("Salário antes do reajuste: %.2d\n ", salarioAtual);
               "o percentual de aumento aplicado: \n" +
                "o valor do aumento: \n" +
                "o novo salário: %.2f");*/
    }
}