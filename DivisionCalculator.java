interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

public class DivisionCalculator {
    public static void main(String[] args) {
        double avg = 65;

        Result r = new Result();
        String result = r.getDivision(avg);

        System.out.println("Division: " + result);
        System.out.println("maitri chauhan. 250393107003");
    }
}