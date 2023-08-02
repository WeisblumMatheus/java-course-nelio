package curso.nelio.java;


import static java.lang.Math.sqrt;

public class Section08Exercicio01Rectangle {
        double width;
        double height;

        public double area() {
            return width * height;
        }

        public double perimeter() {
            return 2 * width + 2 * height;
        }

        public double diagonal() {
            return Math.sqrt(width * width + height * height);
        }
}
