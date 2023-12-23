/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        float altura, pesoIdeal = 0;

        System.out.println("Informe seu sexo: M - Masculino | F - Feminino: ");
        sexo = sc.next().charAt(0);

        System.out.println("Informe sua altura");
        altura = sc.nextFloat();

        System.out.println(sexo);
        if (sexo == 'M' || sexo == 'm'){
            pesoIdeal = (float) (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
                pesoIdeal = (float) ((float) ((float) 62.1 * altura) - 44.7);
        } else {
                System.out.print("Valor Inválido, por favor verifique o sexo digitado.");
        }

        System.out.printf("Peso Ideal: %.2f", pesoIdeal);
    }
}