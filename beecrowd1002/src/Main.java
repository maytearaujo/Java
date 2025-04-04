import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, pi = 3.14159, raio;

        raio = sc.nextDouble();

        A = pi * (raio * raio);

        //System.out.printf("A=%.4d%n",A);
        System.out.printf("A=%.4f%n",A);
        sc.close();
    }
}