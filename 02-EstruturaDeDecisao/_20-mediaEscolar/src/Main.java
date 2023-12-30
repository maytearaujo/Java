/*Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por
aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, media;

        System.out.print("Informe a 1º nota: ");
        n1 = sc.nextFloat();

        System.out.print("Informe a 2º nota: ");
        n2 = sc.nextFloat();

        System.out.print("Informe a 3º nota: ");
        n3 = sc.nextFloat();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7 &&  media < 10)
            System.out.printf("Aprovado com média %.0f", media);
        else if ( media >=0 && media < 7)
            System.out.printf("Reprovado com média %.0f", media);
        else if (media == 10)
            System.out.printf("Aprovado com Distinção e média %.0f", media);

    }
}