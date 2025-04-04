/*Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada
não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário,
conforme exemplo abaixo:
Montar a tabuada de: 5
Começar por: 4
Terminar em: 7
Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35

Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, inicio, fim;

        do {
            System.out.print("Informe um número inteiro: ");
            num = sc.nextInt();
        }while(num <= 0);

        do {
            System.out.println("O inicio precisa ser menor que o fim");
            do {
                System.out.print("Informe um número para começar: ");
                inicio = sc.nextInt();
            } while (num <= 0);

            do {
                System.out.print("Informe um número para terminar: ");
                fim = sc.nextInt();
            } while (num <= 0);

        }while (fim <= inicio);

        System.out.println(" ");
        System.out.println("Montar a tabuada do " + num);
        System.out.println("Começar por: " + inicio );
        System.out.println("Terminar em: " + fim);

        for( int i = inicio; i <= fim; i++){
            System.out.printf("%d X %d = %d%n", num, i, (num * i));
        }
    }
}