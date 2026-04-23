import java.util.*;

public class SearchDemoo {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Maitri");
        names.add("Riya");
        names.add("Aman");

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in roll numbers: " + searchElement(rollNumbers, 105));

        System.out.println("Search Maitri in names: " + searchElement(names, "Maitri"));
        System.out.println("Search Jojo in names: " + searchElement(names, "Jojo"));

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}