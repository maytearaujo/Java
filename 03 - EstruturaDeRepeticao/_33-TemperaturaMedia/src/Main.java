/*O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto
indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das
 temperaturas.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = 0, soma = 0, media, menor, maior;

        ArrayList<Float> temperaturas = new ArrayList<>();

        System.out.println("Para finalizar a digitação das temperaturas digite 1000");
        while( temp != 1000 ) {
            System.out.print("Informe a temperatura: ");
            temp = sc.nextFloat();

            if (temp != 1000){
                temperaturas.add(temp);
            }
        }
        menor = temperaturas.get(0);
        maior = temperaturas.get(0);

        for (int i = 1; i < temperaturas.size(); i++){
            if (temperaturas.get(i) < menor) {
                menor = temperaturas.get(i);
            }
            else if (temperaturas.get(i) > maior)
                maior = temperaturas.get(i);
        }

        for (int j = 0; j < temperaturas.size(); j++){
            soma += temperaturas.get(j);
        }

        media =  soma / temperaturas.size();
        System.out.printf("A média das temperaturas é: %.2f%nA maior temperatura é: %.2f%nA menor temperatura é: %.2f", media, maior, menor);
    }
}