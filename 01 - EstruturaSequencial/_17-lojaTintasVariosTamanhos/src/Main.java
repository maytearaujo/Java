/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em
latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00
 Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
- comprar apenas latas de 18 litros;
- comprar apenas galões de 3,6 litros;
- misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.   */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tamanhoArea, sobra = 0, total, latas18 = 0, latas3_6=0, litros;

        System.out.print("Informe o tamanho da área: ");
        tamanhoArea = sc.nextFloat();

        litros = tamanhoArea / 6;

        if ( litros % 18 == 0){
             total = litros * 80;
             System.out.println("Latas de 18L: " + latas18 + " Total: " + total);
        } else if (litros % 3.6f == 0) {
              total = litros * 25;
              System.out.println("Latas de 3.6L: " + latas3_6 + " Total: " + total);
        } else {

            if (litros >= 18) {
                latas18 = litros / 18;
                sobra = litros % 18;

            }

            if (sobra >= 3.6 && sobra > 0) {
                latas3_6 = sobra / 3.6f;
            }

            latas18 = (float) Math.floor(latas18);
            latas3_6 = (float) Math.ceil(latas3_6);
            total = (latas18 * 80) + (latas3_6 * 25);

            System.out.println("Latas de 18L: " + latas18 + " Latas de 3.6L: " + latas3_6 + " Total: " + total);
        }
    }
}