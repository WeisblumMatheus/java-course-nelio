package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section08OrientacaoAObjetosMembroEstaticosExercicio01 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double totalMoney = Section08MembroEstaticosExercicio01CurrencyConverter.converterToDolar(quantity, dolarPrice);
        System.out.printf("Amount to be paid= R$ %.2f", totalMoney);

        sc.close();

    }
}
