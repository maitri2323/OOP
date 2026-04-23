import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        System.out.println("Marks of students:");
        for (int m : marks) {
            System.out.println(m);
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        System.out.println("Maitri chauhan");
        System.out.println("250393107003");
    }
}