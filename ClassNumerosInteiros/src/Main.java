/*
*desenvolva uma classe em Java que cria uma lista de números inteiros, recebe os números digitados pelo usuário e ao
* final, mostra os números armazenados e a soma total desses números.
* */

import java.util.Scanner;
import java.util.ArrayList;
public class NumerosInteiros {
    private ArrayList<Integer> lista;

    public NumerosInteiros(){
        lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        lista.add(numero);
    }

    public void exibirNumeros(){
        int soma = 0;

        for(int numero: lista){
            soma += numero;
        }

        System.out.println("Soma Total: "+ soma);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}