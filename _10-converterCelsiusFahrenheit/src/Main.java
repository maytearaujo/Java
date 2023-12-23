/*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Informe a temperatura em graus Celsius: ");
        celsius = sc.nextFloat();

        fahrenheit = (float) (celsius * 1.8) +32;
        System.out.println(celsius + "C equivalem a " + fahrenheit + "F");

    }
}