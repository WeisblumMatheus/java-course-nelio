package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section01EstruturaSequencialExercicio02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a value to radius: ");
        double circleRadius = sc.nextDouble();
        double pi = 3.14159;

        double area = circleRadius * circleRadius * pi;
        System.out.println("The area of this circle is " + area);

        sc.close();
    }
}
