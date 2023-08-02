package curso.nelio.java;


public class Section08Exercicio03Student {
        String name;
        double grade1;
        double grade2;
        double grade3;

        public double finalGrade() {
                return grade1 + grade2 + grade3;
        }

        public double missingPoints() {
                return 60.00 - finalGrade();
        }
}

