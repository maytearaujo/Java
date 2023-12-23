import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, B, b, h;

        System.out.print("Informe a base menor do trapézio: ");
        b = sc.nextFloat();

        System.out.print("Informe a base maior do trapézio: ");
        B = sc.nextFloat();

        System.out.print("Informe a altura do trapézio: ");
        h = sc.nextFloat();

        a =( (b + B) / 2f) * h;

        System.out.println("Área do trapézio: " + a);

    }
}