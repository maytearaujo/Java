import java.util.Scanner;

/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um
sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães,
de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preco;
        int i = 1;

        System.out.print("Informe o preço do pão R$ ");
        preco = sc.nextFloat();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        do {
            System.out.printf("%d - R$ %.2f%n", i, preco * i);
           i++;
        } while ( i <= 50 );
    }
}