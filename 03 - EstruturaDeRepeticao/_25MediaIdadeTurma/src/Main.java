/*Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da
turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a
 média calculada.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 1, j = 1, media = 0, soma = 0;
        ArrayList<Integer> idades = new ArrayList<>();

        while ( idade >= 0){
            System.out.printf("Informe a idade da %d pessoa ", j);
            idade = sc.nextInt();

            if (idade >= 0) {
                idades.add(idade);
                j++;
            }
        }

        for (int i = 0; i < idades.size(); i++){
            soma+= idades.get(i);
        }

        media = soma / idades.size();

        if (media >= 0 && media <= 25)
            System.out.println("média de idade da turma varia entre 0 e 25 anos");
        else if (media >= 26 && media <= 60)
            System.out.println("média de idade da turma varia entre 26 e 60 anos");
        else if (media > 60)
            System.out.println("média de idade da turma é maior que 60 anos ");
    }
}