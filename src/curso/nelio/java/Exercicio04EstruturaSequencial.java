package curso.nelio.java;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04EstruturaSequencial {
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
