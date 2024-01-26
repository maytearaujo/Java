
/*Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        int  numero = 0, maior = 0, menor = 0, soma = 0;

        while (numero >= 0 && numero <= 1000) {
            System.out.print("Informe o  número: ");
            numero = sc.nextInt();

            if (numero >= 0 && numero <= 1000)
                listaNumeros.add(numero);
        }

        for (int i = 0; i < listaNumeros.size(); i++){
            soma += listaNumeros.get(i);
        }

        maior = listaNumeros.get(0);
        menor = listaNumeros.get(0);

        for (int i = 1; i < listaNumeros.size(); i++){
            if ( listaNumeros.get(i) > maior)
                maior = listaNumeros.get(i);
            else if ( listaNumeros.get(i) < menor)
                menor = listaNumeros.get(i);
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Soma dos numeros: " + soma);
    }
}