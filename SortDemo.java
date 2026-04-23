import java.util.*;

public class SortDemo {

    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(5);

        System.out.println("Before sorting numbers: " + numbers);
        sortList(numbers);
        System.out.println("After sorting numbers: " + numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Maitri");
        names.add("Riya");
        names.add("Shital");
        names.add("Jojo");

        System.out.println("\nBefore sorting names: " + names);
        sortList(names);
        System.out.println("After sorting names: " + names);

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}