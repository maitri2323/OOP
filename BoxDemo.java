import java.util.*;

class Box<T> {
    ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        Box<String> nameBox = new Box<>();
        nameBox.addItem("Maitri");
        nameBox.addItem("Komal");
        nameBox.addItem("Archi");

        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        System.out.println("Names:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}