/*Faça um Programa que verifique se uma letra digitada é vogal ou consoante.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("Digite uma letra: ");
        letra = sc.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
                letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            System.out.println("Vogal");
        else if (letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F' || letra == 'G' || letra == 'H' ||
                letra == 'J' || letra == 'K' || letra == 'L' || letra == 'M' || letra == 'N' || letra == 'P' ||
                letra == 'Q' || letra == 'R' || letra == 'S' || letra == 'T' || letra == 'V' || letra == 'X' ||
                letra == 'Z' || letra == 'W' || letra == 'Y' ||
                letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' ||
                letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' ||
                letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || letra == 'x' ||
                letra == 'z' || letra == 'w' || letra == 'y' )
            System.out.println("Consoante");
        else
            System.out.println("Valor inválido!");
    }
}