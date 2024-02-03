/*Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a
 quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdTurmas, alunos, i = 0, soma = 0, media;
        ArrayList<Integer> qtdAlunos = new ArrayList<>();

        System.out.print("Informe a quantidade de turmas: ");
        qtdTurmas = sc.nextInt();

        while ( i < qtdTurmas){
            System.out.println("Informe a quantidade de alunos da turma " + (i+1));
            alunos = sc.nextInt();

            if (alunos > 0 && alunos <= 40) {
                qtdAlunos.add(alunos);
                i++;
            }else{
                System.out.println("Vefifique a quantidade de alunos digitados");
            }

        }

        for (int j = 0; j < qtdAlunos.size(); j++){
            soma+= qtdAlunos.get(j);
        }

        media = soma / qtdAlunos.size();
        System.out.println("A média de alunos por sala é " + media);
    }
}