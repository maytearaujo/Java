/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora inicial e final do jogo: ");

        int horaInicial = sc.nextInt(), horaFinal = sc.nextInt(), duracao;

        if (horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }


        System.out.printf("Duração do jogo: %d", duracao);
    }
}