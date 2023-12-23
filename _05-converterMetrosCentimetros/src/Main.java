import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float metros, centimetros;

        System.out.print("Informe um valor em metros: ");
        metros = sc.nextFloat();

        centimetros = metros * 100;

        System.out.println(metros + " metro(s) equivalem a " + centimetros);
    }
}