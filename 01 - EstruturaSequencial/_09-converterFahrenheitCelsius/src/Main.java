
/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
 C = 5 * ((F-32) / 9).*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit, celsius;

        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        fahrenheit = sc.nextFloat();

        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.println(celsius + "C equivalem a " + fahrenheit + "F");
    }
}