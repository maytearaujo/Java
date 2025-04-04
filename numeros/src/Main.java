
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um número: ");
        num = sc.nextInt();

        if (num > 80) {
            System.out.println("maior que 80");
        } else if ( num < 25) {
            System.out.println("menor que 25");
        } else if (num == 40) {
            System.out.println("Igual a 40");
        }
    }
}