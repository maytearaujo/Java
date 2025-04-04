import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        float soma = 0, media = 0, qtd=0;
        do {
            System.out.print("Informe um número: ");
            N = sc.nextInt();
        } while (N <= 0);

        float[] numeros = new float[N];

        for (int i = 0; i < N; i++){
            System.out.print("Informe o " + (i+1) + "º elemento: ");
            numeros[i] = sc.nextFloat();
            soma += numeros[i];
        }

        media = soma / N;

        System.out.printf("Media: %.2f", media);
        System.out.printf("Soma: %.2f", soma);
    }
}