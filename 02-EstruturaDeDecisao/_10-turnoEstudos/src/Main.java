/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turnoEstudos;

        System.out.print("Informe seu turno de estudos: M - Matutino | V - Vespertino | N - Noturno: ");
        turnoEstudos = sc.next().charAt(0);

        if (turnoEstudos == 'M' || turnoEstudos == 'm')
            System.out.println("Bom dia!");
        else if (turnoEstudos == 'V' || turnoEstudos == 'v')
            System.out.println("Boa Tarde!");
         else if (turnoEstudos == 'N' || turnoEstudos == 'n')
            System.out.println("Boa Noite");
         else
            System.out.println("Valor Inválido");
    }
}