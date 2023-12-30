import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }

    }
}