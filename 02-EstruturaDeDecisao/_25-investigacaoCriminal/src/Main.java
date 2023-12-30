/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char p1, p2, p3, p4, p5;
        int result = 0;

        System.out.println("Por favor responda o questionário a seguir com Sim - S ou Não - N: ");

        System.out.print("1. Você telefonou para a vítima?: ");
        p1 = sc.next().charAt(0);
        if ( p1 == 'S' || p1 == 's')
            result++;


        System.out.print("2. Você esteve no local do crime?: ");
        p2 = sc.next().charAt(0);
        if ( p2 == 'S' || p2 == 's')
            result++;


        System.out.print("3. Você mora perto da vítima?: ");
        p3 = sc.next().charAt(0);
        if (p3 == 'S' || p3 == 's')
            result++;

        System.out.print("4. Você devia para a vítima?: ");
        p4 = sc.next().charAt(0);
        if (p4 == 'S' || p4 == 's')
            result++;

        System.out.print("5. Você já trabalhou com a vítima?: ");
        p5 = sc.next().charAt(0);
        if (p5 == 'S' || p5 == 's')
            result++;


        if (result == 2)
            System.out.println("Suspeita");
        else if (result >=3 && result <= 4)
            System.out.println("Cúmplice");
        else if(result == 5)
            System.out.println("Assassino");
        else
            System.out.println("Inocente");
    }
}