import java.util.Scanner;

public class PRAC4BmiCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();
        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kg / (meters * meters);
        System.out.println("Your BMI is: " + bmi);
    }
}