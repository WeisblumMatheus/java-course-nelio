package curso.nelio.java;

import java.util.Scanner;

public class Section04EstruturaSequencialExercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int difference = (A*B-C*D);
        System.out.println("The difference is " + difference);

        sc.close();
    }
}
