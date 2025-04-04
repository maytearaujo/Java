import java.util.ArrayList;

public class ListaNumeros {
    private ArrayList<Integer> lista;

    public ListaNumeros() {
        lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public void exibirNumeros(){
        System.out.println("Números armazenados:");
        for (int numero : lista) {
            System.out.println(numero);
        }
    }

    public void exibirSomaTotal() {
        int soma = 0;

        for (int numero : lista) {
            soma += numero;
        }

        System.out.println("Soma Total: " + soma);
    }
}
