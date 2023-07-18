package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section05EstruturaCondicionalExercicio06 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number to verify if it`s in the Range");
        double number = sc.nextDouble();

        if (number <= 25){
            System.out.println("Range [0,25]");
        }
        else if (number > 25 && number <= 50){
            System.out.println("Range (25,50]");
        }
        else if (number > 50 && number <= 75){
            System.out.println("Range (50,75]");
        }
        else if (number > 75 && number <= 100){
            System.out.println("Range (75,100]");
        }
        else{
            System.out.println("Out of the Range");
        }

        sc.close();
    }
}
