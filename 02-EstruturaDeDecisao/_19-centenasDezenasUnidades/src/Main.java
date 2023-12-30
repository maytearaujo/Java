/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, centenas = 0, dezenas = 0, unidades = 0;
    String undCentenas = "Centena", undDezenas = "Dezena", undUnidades = "Unidade";

        System.out.print("Informe um número inteiro menor que 1000: ");
        number = sc.nextInt();

        if (number <= 1000){
            centenas = number / 100;
            if (number % 1000 != 0)
                dezenas = (number % 100) /10;
                if (number % 100 != 0)
                    unidades = number % 10;
        else
            System.out.println("Valor Inválido");
        }

        if(centenas > 1)
            undCentenas = "Centenas";
        if (dezenas > 1)
            undDezenas = "Dezenas";
        if (unidades > 1)
            undUnidades = "Unidades";

        System.out.printf("%d possui %d %s %d %s %d %s", number, centenas, undCentenas, dezenas, undDezenas, unidades, undUnidades);
    }
}