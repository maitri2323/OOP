class NotSufficientFundException extends Exception {
    NotSufficientFundException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 1000.00;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) throws NotSufficientFundException {
        if (balance - amt < 1000) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000.00);

        try {
            acc.withdraw(400.00);
            acc.withdraw(300.00);
            acc.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + acc.balance);
        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}