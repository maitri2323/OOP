interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class ResultSystem {
    public static void main(String[] args) {
        int mark = 55;
        double average = 62.5;

        Result r = new Result();

        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(average));
        System.out.println("maitri chauhan. 250393107003");
    }
}