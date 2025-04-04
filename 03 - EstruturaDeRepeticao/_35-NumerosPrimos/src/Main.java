/*. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes
entre 1 e um número inteiro informado pelo usuário*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, count = 0;
        ArrayList<Integer> primos = new ArrayList<>();

        System.out.print("informe um número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                if ( i % j == 0){
                    count++;
                }
            }
            if (count == 2 ){
                primos.add(i);
            }
            count = 0;
        }

        System.out.println("Números primos entre 1 e " + numero );
        for (int i = 0; i < primos.size(); i++){
            System.out.print( primos.get(i) + " ");
        }
    }
}