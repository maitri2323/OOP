class BankAccountt {

    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccountt(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return balance * interest_rate / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        BankAccountt.updateInterestRate(5.0);

        BankAccountt a1 = new BankAccountt("Maitri", 10000);
        BankAccountt a2 = new BankAccountt("Jojo", 20000);

        a1.displayInterest();
        a2.displayInterest();

        BankAccountt.updateInterestRate(6.5);

        System.out.println("After Interest Rate Update");

        a1.displayInterest();
        a2.displayInterest();
    }
}