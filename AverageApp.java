public class AverageApp {

    static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;

        for (String val : values) {
            if (val == null) {
                throw new NullPointerException("Null value found");
            }
            double num = Double.parseDouble(val);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        String[] valid = {"10", "20", "30"};
        String[] invalidNumber = {"10", "abc", "30"};
        String[] nullValue = {"10", null, "30"};

        try {
            System.out.println("Valid Input Average: " + average(valid));
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("First case completed");
        }

        System.out.println();

        try {
            System.out.println("Invalid Number Average: " + average(invalidNumber));
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Second case completed");
        }

        System.out.println();

        try {
            System.out.println("Null Value Average: " + average(nullValue));
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Third case completed");
        }

        System.out.println("maitri chauhan. 250393107003");
    }
}