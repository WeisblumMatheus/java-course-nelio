package curso.nelio.java;

import java.util.Scanner;

public class Section06EstruturaRepetitivaExercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which did you use:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim ");
        int choose = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (choose != 4) {
            if (choose == 1) {
                alcool += 1;
            }
            else if (choose == 2) {
                gasolina += 1;
            }
            else if (choose == 3) {
                diesel += 1;
            }
            System.out.println("Which did you use:\n 1.Álcool\n 2.Gasolina\n 3.Diesel\n 4.Fim ");
            choose = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d, Gasoline: %d, Diesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}
