// Classe de base représentant un compte bancaire
public class BankAccount {

    // Numéro du compte
    public String account;

    // Solde du compte
    public double balance;

    // Constructeur
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }
}