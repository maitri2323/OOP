class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        System.out.println("Final Bill Amount: " + (itemTotal - discount));
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
	System.out.println("Maitri Chauhan, 250393107003");;
    }

    public static void main(String[] args) {
        BillGenerator bill = new BillGenerator();

        bill.generateBill(2000);
        bill.generateBill(2000, 300);
        bill.generateBill(2000, 10.0);
    }
}