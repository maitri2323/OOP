public class DivisionExceptionDemo {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two arguments");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Enter valid integers only");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } 
        finally {
            System.out.println("Program executed");
            System.out.println("maitri chauhan. 250393107003");
        }
    }
}