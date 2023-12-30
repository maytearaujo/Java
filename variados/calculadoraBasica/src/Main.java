import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2, resultado = 0;
        char operador;

        System.out.print("Informe o 1º número: ");
        n1 = sc.nextFloat();

        System.out.println("Informe o operador: + - * /");
        operador = sc.next().charAt(0);

        System.out.print("Informe o 2º número: ");
        n2 = sc.nextFloat();

        switch (operador){
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default: System.out.println("Operador inválido");
        }

        System.out.println(n1 + " " + operador + " " + n2 + " = " + resultado);
    }
}