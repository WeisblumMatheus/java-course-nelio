package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section01EstruturaSequencialExercicio05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double value1 = sc.nextDouble();

        int code2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double value2 = sc.nextDouble();

        double sum = quantity1 * value1 + quantity2 * value2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", sum);

        sc.close();
    }
}
