package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section08OrientacaoAObjetosExercicio03 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Section08Exercicio03Student student = new Section08Exercicio03Student();
        System.out.println("Enter the name and your grades: ");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        double result = student.finalGrade();

        if (result >= 60.00) {
            System.out.printf("FINAL GRADE = %.2f\n" +
                    "PASS", result);
        }

        else {
            System.out.printf("FINAL GRADE = %.2f\n" +
                    "FAILED\n" +
                    "MISSING %.2f POINTS", result, student.missingPoints());
        }
        sc.close();
    }
}
