/*Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor
votar e ao final mostrar o número de votos de cada candidato.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int voto ,candidato1 = 0, candidato2 = 0, candidato3 = 0, eleitores, votosInvalidos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de eleitores: ");
        eleitores = sc.nextInt();

        System.out.println("\n");
        System.out.println(" ***** CANDIDATOS *****");
        System.out.print("1 - Luiza Erundina ");
        System.out.print("2 - Benedita da Silva ");
        System.out.print("3 - Marta Suplicy");

        System.out.println("\n");
        System.out.println(" ****** INICIANDO A VOTAÇÃO ******");
        for (int i = 0; i < eleitores; i++) {
            System.out.print((i+1) + "º Informe o número do candidato: ");
            voto = sc.nextInt();

            if (voto == 1)
                candidato1++;
            else if ( voto == 2)
                candidato2++;
            else if (voto == 3)
                candidato3++;
            else
                votosInvalidos++;
        }
        System.out.println("\n");
        System.out.println("===== TOTALIZANDO VOTOS =====");
        System.out.printf(" Luiza Erundina: %d%n Benedita da Silva: %d%n Marta Suplicy: %d%n Votos Inválidos: %d ", candidato1, candidato2, candidato3, votosInvalidos);
    }
}