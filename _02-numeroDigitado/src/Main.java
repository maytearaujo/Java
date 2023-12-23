import java.util.Scanner;

/* Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();

        System.out.println("O número informado foi " + numero);
    }
}