package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section06EstruturaRepetitiva02Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            double firstNumber = sc.nextDouble();
            double secondNumber = sc.nextDouble();
            double thirdNumber = sc.nextDouble();

            double average = (firstNumber * 2 + secondNumber * 3 + thirdNumber * 5) / 10;
            System.out.printf("%.1f\n", average);
        }
        sc.close();
    }
}
