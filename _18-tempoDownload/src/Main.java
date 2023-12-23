/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de
Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tamanho, velocidade, tempoDownload;

        System.out.println("Informe o tamanho de um arquivo para download (em MB): ");
        tamanho = sc.nextFloat();

        System.out.println("Informe a velocidade de um link de Internet (em Mbps): ");
        velocidade = sc.nextFloat();

        velocidade = velocidade / 8;
        tempoDownload = tamanho / velocidade;
        tempoDownload = tempoDownload / 100;

        System.out.println("O tempo aproximado de download do arquivo é: " + tempoDownload +" minutos");
    }
}