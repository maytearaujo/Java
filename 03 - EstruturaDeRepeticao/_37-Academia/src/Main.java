/*. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o
mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua
altura e seu peso. O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.
Ao encerrar o programa também deve ser informados os códigos e valores do clente mais alto, do mais baixo, do mais
gordo e do mais magro, além da média das alturas e dos pesos dos clientes
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float maisAlto = 0, maisBaixo = 0, maisGordo = 0, maisMagro = 0, codigo = 0, altura = 0, peso = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe o código: ");
            codigo = sc.nextFloat();

            System.out.println("Informe a altura: ");
            altura = sc.nextFloat();

            System.out.println("Informe o peso");
            peso = sc.nextFloat();

        } while ( codigo != 0);
    }
}