package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section02EstruturaCondicionalExercicio05 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your food and your quantity");
        System.out.println("Code     Type         Price\n" +
                " 1      Hot Dog      R$ 4.00\n" +
                " 2      X-Salad      R$ 4.50\n" +
                " 3      X-Bacon      R$ 5.00\n" +
                " 4      Toast        R$ 2.00\n" +
                " 5      Soda         R$ 1.50");

        int pick = sc.nextInt();
        int quantity = sc.nextInt();
        double price = 0;

        if (pick == 1){
            price = 4.00;
        }
        else if (pick == 2){
            price = 4.50;
        }
        else if (pick == 3){
            price = 5.00;
        }
        else if (pick == 4){
            price = 2.00;
        }
        else if (pick == 5){
            price = 1.50;
        }
        else{
            System.out.println("This option doesn't exist in this menu, try again!!");
        }
        double totalPrice = price * quantity;

        System.out.printf("Total: R$ %.2f", totalPrice);
    }
}
