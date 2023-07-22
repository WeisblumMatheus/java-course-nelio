package curso.nelio.java;

import java.util.Scanner;

public class Section06EstruturaRepetitiva02Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<=n; i++) {
           fatorial = fatorial * i;
        }
        System.out.printf("%d", fatorial);
        sc.close();
    }
}
