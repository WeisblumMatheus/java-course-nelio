package curso.nelio.java;

import java.util.Scanner;

public class Section06EstruturaRepetitiva02Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Put how many numbers, you would like to know if is in the intervale");
        int n = sc.nextInt();
        int inside = 0;
        int outside = 0;

        for (int i=1; i<=n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                inside += 1;
            }
            else {
                outside += 1;
            }
        }
        System.out.printf("%d in\n%d out", inside, outside);
        sc.close();
    }
}
