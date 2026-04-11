import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;
    int orderId = 101;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        System.out.println("Order placed successfully");
        System.out.println("Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {
    public void cancelOrder(int orderId) {
        System.out.println("Order " + orderId + " has been cancelled");
    }

    public void generateBill() {
        int price = 100;
        int total = qty * price;
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FinalOrder fo = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        fo.placeOrder(item, qty);

        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            fo.generateBill();
        } else {
            fo.cancelOrder(101);
        }

        System.out.println("maitri chauhan. 250393107003");
    }
}