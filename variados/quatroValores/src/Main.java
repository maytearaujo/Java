import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.print("Informe o 1º número: ");
        a = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        b = sc.nextInt();

        System.out.print("Informe o 3º número: ");
        c = sc.nextInt();

        System.out.print("Informe o 4º número: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;
        System.out.println("A diferença do produto de A e B pelo produto de C e D é : " + diferenca);
    }
}