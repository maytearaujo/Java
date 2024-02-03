/*Faça um programa que calcule o mostre a média aritmética de N notas.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        int i = 0, num = 0, soma = 0; float media;
        Scanner sc = new Scanner(System.in);

        while (num >= 0 ) {
            System.out.printf("Informe o %d número: ", (i+1));
            num = sc.nextInt();
            i++;

            if( num > 0) {
                number.add(num);
            }
        }

        for (int j = 0; j < number.size(); j++){
            soma+= number.get(j);
        }

        media = soma / number.size();
        System.out.println("A média é " + media);
    }
}