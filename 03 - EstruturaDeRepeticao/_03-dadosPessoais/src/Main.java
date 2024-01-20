/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        float salario;
        char sexo, estadoCivil;

        do{
            System.out.print("Informe seu nome: ");
            nome = sc.next();

            if (nome.length() < 3)
                System.out.println("Informe um nome com no mínimo 3 caracteres");
        }while (nome.length() < 3);

        do{
            System.out.print("Informe sua idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150 )
                System.out.println("Favor informar uma idade entre 0 e 150");
        }while (idade < 0 || idade > 150);

        do {
            System.out.println("informe seu salário: ");
            salario = sc.nextFloat();

            if (salario < 0)
                System.out.print("Informe um salário positivo");
        } while (salario < 0);

        do{
            System.out.println("Informe o sexo m - Masculino | f - Feminino:");
            sexo = sc.next().charAt(0);
            System.out.println(sexo);
            if (sexo != 'f' || sexo != 'm')
                System.out.println("Informe m ou f");
        } while (sexo != 'f' || sexo != 'm');

        do{
            System.out.println("Informe o estado civil (s - Solteiro | c - Casado | v - Viúvo | d - Divorciado): ");
            estadoCivil = sc.next().charAt(0);

            if (estadoCivil != 's' || estadoCivil != 'c' || estadoCivil != 'v' || estadoCivil != 'd')
                System.out.println("Favor verificar valor digitado");
        }while (estadoCivil != 's' || estadoCivil != 'c' || estadoCivil != 'v' || estadoCivil != 'd');
    }
}