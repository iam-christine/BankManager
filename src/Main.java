public class Main {
    public static void main(String[] args) {
        // Création des objets
        CheckingAccount c1 = new CheckingAccount("C001", 30000, 500);
        SavingsAccount s1 = new SavingsAccount("S001", 55000, 3.5);
        COD cod1 = new COD("D001", 7000, 12);

        // Accès aux attributs hérités
        System.out.println("CheckingAccount : " + c1.account + " - " + c1.balance);
        System.out.println("SavingsAccount : " + s1.account + " - " + s1.balance);
        System.out.println("COD : " + cod1.account + " - " + cod1.balance);
    }
}