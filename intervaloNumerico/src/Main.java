/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float num;

        System.out.print("Informe um número: ");
        num = sc.nextFloat();

        if (num >= 0 && num <= 25){
            System.out.printf("%.2f se encontra no intervalo entre 0 e 25", num);
        } else if (num > 25 && num <= 50) {
            System.out.printf("%.2f se encontra no intervalo entre 25 e 50", num);
        } else if (num >50 && num <= 75) {
            System.out.printf("%.2f se encontra no intervalo entre 50 e 75", num);
        } else if (num > 75 && num <= 100) {
            System.out.printf("%.2f se encontra no intervalo entre 75 e 100", num);
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}