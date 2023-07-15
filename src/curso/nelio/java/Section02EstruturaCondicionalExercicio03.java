package curso.nelio.java;

import java.util.Scanner;

public class Section02EstruturaCondicionalExercicio03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write two number to verify if they are multiples");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        if (firstNumber % secondNumber == 0 || secondNumber % firstNumber ==0){
            System.out.println("MULTIPLES");
        }
        else{
            System.out.println("NOT MULTIPLES");
        }

        sc.close();
    }
}
