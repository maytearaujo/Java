/*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
  Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

  O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o
  conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;
        char conceito;
        String situacao;

        System.out.print("Informe a 1ª nota: ");
        n1 = sc.nextFloat();

        System.out.print("Informe a 2ª nota: ");
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;

        if (media > 9 && media <= 10)
            conceito = 'A';
        else if (media > 7.5f && media <= 9)
            conceito = 'B';
        else if (media > 6.0 && media <= 7.5 )
            conceito = 'C';
        else if (media > 4.0 && media <= 6.0 )
            conceito = 'D';
        else if (media > 0 && media <= 4)
            conceito = 'E';
        else
            conceito = ' ';

    if (conceito == 'A' || conceito == 'B' || conceito == 'C')
        situacao = "Aprovado";
    else
        situacao = "Reprovado";


    System.out.printf(" 1ª Nota: %.2f %n 2ª Nota: %.2f %n Média: %.2f %n Conceito: %c%n Situação: %s", n1, n2, media, conceito, situacao);
    }
}