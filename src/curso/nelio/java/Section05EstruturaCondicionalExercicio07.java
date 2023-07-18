package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section05EstruturaCondicionalExercicio07 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type two points to verify how is the position in the Cartesian Plane");
        double xAxis = sc.nextDouble();
        double yAxis = sc.nextDouble();

        if (xAxis == 0 && yAxis == 0){
            System.out.println("ORIGIN");
        }
        else if (xAxis == 0){
            System.out.println("Axis Y");
        }
        else if (yAxis == 0){
            System.out.println("Axis X");
        }
        else if (xAxis > 0 && yAxis > 0) {
            System.out.println("Q1");
        }
        else if (xAxis < 0 && yAxis > 0) {
            System.out.println("Q2");
        }
        else if (xAxis < 0 && yAxis < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
