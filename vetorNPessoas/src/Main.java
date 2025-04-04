import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        float media=0, perCentLess16, qtdLess16=0;


        do {
            System.out.print("Informe um número: ");
            num = sc.nextInt();
        } while (num <= 0);

        String[] nomes = new String[num];
        int[] idades = new int[num];
        float[] alturas = new float[num];

        for (int i = 0; i < num; i++){

            System.out.print("Informe o nome: ");
            nomes[i] = sc.next();

            System.out.print("Informe o idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Informe o altura: ");
            alturas[i] = sc.nextFloat();

            media += alturas[i];

            if (idades[i] < 16){
                qtdLess16++;
            }
        }

        media /= num;
        perCentLess16 = (float)(qtdLess16*100) / num;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", perCentLess16);
    }
}