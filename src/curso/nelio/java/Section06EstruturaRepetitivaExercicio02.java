package curso.nelio.java;

import java.util.Scanner;

public class Section06EstruturaRepetitivaExercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your coordenate: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("First Quadrant");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second Quadrant");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third Quadrant");
            }
            else {
                System.out.println("Fourth Quadrant");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
