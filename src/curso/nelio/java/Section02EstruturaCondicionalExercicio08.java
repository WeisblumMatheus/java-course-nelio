package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section02EstruturaCondicionalExercicio08 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your salary");
        double salary = sc.nextDouble();
        double finalTax = 0;

        if (salary >= 0 && salary <= 2000){
            System.out.println("Free");
        }
        else if (salary > 2000 && salary <= 3000){
            finalTax = (salary - 2000) * 0.08;
        }
        else if (salary > 3000 && salary <= 4500){
            finalTax = 1000 * 0.08 + (salary - 3000) * 0.18;
        }
        else{
            finalTax = 1000 * 0.08 + 1500 * 0.18 + (salary - 4500) * 0.28;
        }
        if (salary > 2000){
            System.out.printf("R$ %.2f", finalTax);
        }

        sc.close();
    }
}
