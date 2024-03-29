/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tipoCombustivel, alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Escolha o tipo de combustível [  1.Álcool     2.Gasolina      3.Diesel     4.Fim]: ");
        tipoCombustivel = sc.nextInt();

        while (tipoCombustivel != 4){
            if (tipoCombustivel == 1)
                alcool++;
            else if (tipoCombustivel == 2)
                gasolina++;
            else if (tipoCombustivel == 3)
                diesel++;
            else
                System.out.print("Código inválido, digite novemente.");

            tipoCombustivel = sc.nextInt();
        }

        System.out.printf("Muito Obrigado.%nÁlcool: %d%nGasolina:  %d%nDiesel:  %d%n", alcool, gasolina, diesel);
    }
}