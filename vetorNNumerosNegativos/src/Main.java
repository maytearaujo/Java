import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Informe um número: ");
            num = sc.nextInt();
        } while (num <= 0);

        int[] numeros = new int[num];

        for (int i = 0; i < num; i++){
            System.out.println("Informe o " + (i+1) + "º número");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0 ){
                System.out.print(numeros[i] + " ");
            }
        }
    }
}