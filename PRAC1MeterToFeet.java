import java.util.Scanner;

class PRAC1MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meters: ");
        double m = sc.nextDouble();

        double f = m * 3.28084;

        System.out.println("Feet: " + String.format("%.2f", f));
    }
}
