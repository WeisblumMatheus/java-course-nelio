package curso.nelio.java;

import java.util.Scanner;

public class Section05EstruturaCondicionalExercicio04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the initial hour and the final hour of the game");

        int initialHour = sc.nextInt();
        int finalHour = sc.nextInt();
        int duracao;

        if (initialHour >= finalHour){
            duracao = 24 - initialHour + finalHour;
        }
        else{
            duracao = finalHour  - initialHour;
        }

        System.out.printf("THE GAME LAST %d HOUR(S)", duracao);

        sc.close();
    }
}
