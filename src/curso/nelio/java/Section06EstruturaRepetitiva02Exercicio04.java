package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section06EstruturaRepetitiva02Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            double firstNumber = sc.nextDouble();
            double secondNumber = sc.nextDouble();

            if (secondNumber == 0) {
                System.out.println("Impossible");
            }
            else {
                double division = firstNumber / secondNumber;
                System.out.printf("%.1f\n", division);
            }
        }
        sc.close();
    }
}
