import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Digite números inteiros para adicionar à lista. Digite um número negativo para terminar:");

        int numero;
         do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

             listaNumeros.adicionarNumero(numero);
        } while (numero > 0);

        listaNumeros.exibirNumeros();
        listaNumeros.exibirSomaTotal();
    }
}