package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section08OrientacaoAObjetosExercicio02 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Section08Exercicio02Employee employee = new Section08Exercicio02Employee();
        System.out.println("Enter the name, gross salary and the tax of your employee: ");
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());
        System.out.println("Which percentage to increase the salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(employee);
        sc.close();
    }
}
