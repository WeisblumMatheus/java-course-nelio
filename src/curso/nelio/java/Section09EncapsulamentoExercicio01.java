package curso.nelio.java;

import java.util.Locale;
import java.util.Scanner;

public class Section09EncapsulamentoExercicio01 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Section09Exercicio01Bank bank;

        System.out.println("Enter your account number: ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter your name: ");
        String nameUser = sc.next();
        System.out.println("Would you like to do your first deposit (y/n)?");
        char firstDeposit = sc.next().charAt(0);

        if (firstDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Section09Exercicio01Bank(numberAccount, nameUser, initialDeposit);
        }
        else {
            bank = new Section09Exercicio01Bank(numberAccount, nameUser);
        }
        System.out.println("Account Data: \n" + bank);

        System.out.println("Enter a value to deposit: ");
        double valueToDeposit = sc.nextDouble();
        bank.deposit(valueToDeposit);
        System.out.println("Updated account data: \n" + bank);

        System.out.println("Enter a value to withdraw: ");
        double valueToWithdraw = sc.nextDouble();
        bank.withdraw(valueToWithdraw);
        System.out.println("Updated account data: \n" + bank);

        sc.close();
   }
}