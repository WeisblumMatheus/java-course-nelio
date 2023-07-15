package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section01EstruturaSequencialExercicio04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        double salaryPerHour = sc.nextDouble();
        double numberHoursWorked = sc.nextDouble();

        double salary = salaryPerHour * numberHoursWorked;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", id, salary);


         sc.close();
    }
}
