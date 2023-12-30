import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 != 0){
            System.out.println("Impar");
        }else{
            if(numero >= 2 && numero <= 5){
                System.out.println("A");
            }else{
                if(numero >= 6 && numero <=20){
                    System.out.println("B");
                }else{
                    if( numero > 20){
                        System.out.println("C");
                    }
                }
            }
        }
    }
}