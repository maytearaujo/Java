/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 1, result = 0;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        if (num > 0 && num <= 10){
            System.out.printf("Tabuada de %d:\n", num);
            while(i < 11){
                result = num * i;
                System.out.printf("%d X %d = %d\n", num, i, result);
                i++;
            }
        }else
            System.out.println("Número fora de intervalo, favor digitar um número entre 1 e 10");
    }
}