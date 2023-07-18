package curso.nelio.java;

import java.util.Scanner;

public class Section04EstruturaSequencialExercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write two values to sum: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of this two number is: " + sum);

        sc.close();
    }

}
