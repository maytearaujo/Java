import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Informe o 1º número: ");
        num1 = sc.nextInt();

        System.out.print("Informe o 2º número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);
    }
}