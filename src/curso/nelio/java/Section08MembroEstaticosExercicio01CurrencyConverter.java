package curso.nelio.java;


public class Section08MembroEstaticosExercicio01CurrencyConverter {
        public static final double IOF = 1.06;

        public static double converterToDolar(double quantity, double dolarPrice){
                return dolarPrice * quantity * IOF;
        }
}

