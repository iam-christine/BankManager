// Compte courant qui hérite de BankAccount
public class CheckingAccount extends BankAccount {

    // Limite de découvert
    public double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance); // appel du constructeur parent
        this.limit = limit;
    }
}