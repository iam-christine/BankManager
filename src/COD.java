// Certificat de dépôt
public class COD extends BankAccount {

    // Durée du dépôt en mois
    public int duration;

    public COD(String account, double balance, int duration) {
        super(account, balance);
        this.duration = duration;
    }
}