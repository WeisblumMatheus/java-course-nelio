package curso.nelio.java;

public class Section09Exercicio01Bank {
    private int numberAccount;
    private String nameUser;
    private double balance;

    public Section09Exercicio01Bank(int numberAccount, String nameUser, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.nameUser = nameUser;
        deposit(initialDeposit);
    }

    public Section09Exercicio01Bank(int numberAccount, String nameUser) {
        this.numberAccount = numberAccount;
        this.nameUser = nameUser;
    }

    public void setName(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getName() {
        return nameUser;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account " + getNumberAccount() + ", " +
                "Holder: " + getName() + ", " +
                "Balance: " + String.format("%.2f", getBalance());
    }
}
