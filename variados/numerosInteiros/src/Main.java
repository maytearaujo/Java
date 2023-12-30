import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Os números digitados são: ");
        System.out.println("O 1º número é: " + a);
        System.out.println("O 2º número é: " + b);
        System.out.println("O 3º número é: " + c);
    }
}