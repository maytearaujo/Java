/*O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de
valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da
compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para
então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar
a próxima compra. A saída deve ser conforme o exemplo abaixo:
Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00
...
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> preco = new ArrayList<>();
        int i = 0;
        float valor, total = 0, dinheiro, troco;

        do{
            System.out.print("Informe o preço do produto: ");
            valor = sc.nextFloat();

            if (valor != 0){
                preco.add(valor);
                i++;
            }
        }while ( valor != 0);

        System.out.println("Lojas Tabajara");

        for (int j = 0; j < preco.size(); j++){
            System.out.printf("Produto %d: %.2f%n", (j+1), preco.get(j));
            total += preco.get(j);
        }

        System.out.println("Total: " + total);

        do {
            System.out.print("Informe o valor em dinheiro: ");
            dinheiro = sc.nextFloat();
        } while( dinheiro < total);

        troco = dinheiro - total;
        System.out.println("Troco: " + troco);
    }
}