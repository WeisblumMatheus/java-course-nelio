package curso.nelio.java;

import java.util.Scanner;

public class Section02EstruturaCondicionalExercicio02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number to verify if it`s odd or even");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }

        sc.close();
    }
}
