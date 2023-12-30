/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma:
A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float litros, precoLitroGasolina = 2.50f, precoLitroAlcool = 1.90f, precoFinal = 0;
        char tipoCombustivel;

        System.out.print("Informe o número de tipo de combustível que deseja comprar A-álcool, G-gasolina: ");
        tipoCombustivel = sc.next().charAt(0);

        System.out.print("Informe o número de litros que deseja comprar: ");
        litros = sc.nextFloat();

        if(tipoCombustivel == 'A' || tipoCombustivel == 'a'){
            if (litros >=0 && litros <= 20){
                precoLitroAlcool = precoLitroAlcool - 0.03f;
                precoFinal = precoLitroAlcool * litros;
            }else if (litros > 20){
                precoLitroAlcool = precoLitroAlcool - 0.05f;
                precoFinal = precoLitroAlcool * litros;
            }

        }
        else if(tipoCombustivel == 'G' || tipoCombustivel == 'g'){
            if (litros >=0 && litros <= 20){
                precoLitroGasolina = precoLitroGasolina - 0.04f;
                precoFinal = precoLitroGasolina * litros;
            }else if (litros > 20){
                precoLitroGasolina = precoLitroGasolina - 0.06f;
                precoFinal = precoLitroGasolina * litros;
            }
        }


        System.out.printf("Preço Gasolina: %.2f Valor a ser pago: %.2f",precoLitroGasolina, precoFinal);
    }
}