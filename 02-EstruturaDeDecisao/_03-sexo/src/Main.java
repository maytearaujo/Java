import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char sexo;

        System.out.print("Informe o sexo: M - Masculino | F- Femino: ");
        sexo = sc.next().charAt(0);

        if( sexo == 'M' || sexo == 'm')
            System.out.println("Masculino");
        else if ( sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        }else
            System.out.println("Sexo Inválido");
    }
}