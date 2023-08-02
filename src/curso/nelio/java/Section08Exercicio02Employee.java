package curso.nelio.java;


public class Section08Exercicio02Employee {
        String name;
        double grossSalary;
        double tax;

        public double netSalary() {
            return grossSalary - tax;
        }

        public void increaseSalary(double percentage) {
           grossSalary += grossSalary * (percentage / 100);
        }

        public String toString() {
            return "Updated data: " + name + " $" + netSalary();
        }
}

