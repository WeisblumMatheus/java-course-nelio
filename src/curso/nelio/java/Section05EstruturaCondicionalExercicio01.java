package curso.nelio.java;

import java.util.Scanner;

public class Section05EstruturaCondicionalExercicio01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number to see if it's negative or not negative: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVE");
        }

        else{
            System.out.println("NOT NEGATIVE");
        }

        sc.close();
    }
}
