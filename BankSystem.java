class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account Opened");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    double calculateInterest() {
        return balance * 4 / 100;
    }
}

class FixedDepositAccount extends BankAccount {

    double maturityAmount(int years) {
        return balance + (balance * 6 * years / 100);
    }
}

class BankSystem {
    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Maitri Chauhan", 10000);
        sa.deposit(5000);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Maitri Chauhan", 20000);
        System.out.println("FD Maturity Amount: " + fd.maturityAmount(3));
    }
}
