import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        double[] numeros = new double[numero];

        for (int i = 0; i < numero; i++){
            System.out.print("Informe o " + (i+1) + "º número: ");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " - ");
        }

    }
}