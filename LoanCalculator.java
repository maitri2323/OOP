class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        int months = time * 12;
        float r = rate / 12 / 100;
        float emi = (principal * r * (float)Math.pow(1 + r, months)) /
                    ((float)Math.pow(1 + r, months) - 1);
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        int months = time * 12;
        double r = rate / 12 / 100;
        double emi = (principal * r * Math.pow(1 + r, months)) /
                     (Math.pow(1 + r, months) - 1);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        int months = time * 12;
        double r = 10.0 / 12 / 100;
        double emi = (principal * r * Math.pow(1 + r, months)) /
                     (Math.pow(1 + r, months) - 1);
        System.out.println("Personal Loan EMI: " + emi);
	System.out.println("Maitri Chauhan, 250393107003");;
    }

    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator();

        lc.calculateEMI(500000, 20, 8.5f);
        lc.calculateEMI(300000, 5, 9.0);
        lc.calculateEMI(100000, 2);
    }
}