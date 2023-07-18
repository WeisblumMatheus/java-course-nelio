package curso.nelio.java;

import java.util.Scanner;

public class Section06EstruturaRepetitivaExercicio01 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your password: ");
        int password = 0;

        while (password != 2002) {
            password = sc.nextInt();
            System.out.println("Wrong Password");
        }
        System.out.println("Valid Password");
        sc.close();
    }
}
