/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.print("Informe o usuário: ");
            usuario = sc.next();

            System.out.print("informe a senha: ");
            senha = sc.next();

            if (usuario.equals(senha))
                System.out.println("Favor diferenciar usuário e senha");
        }while ( usuario.equals(senha));
        System.out.println("Acesso liberado!!");
    }
}