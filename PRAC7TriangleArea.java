import java.util.Scanner;

public class PRAC7TriangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side: ");
        double c = sc.nextDouble();

        if(a + b > c && b + c > a && c + a > b)
        {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle is: " + area);
        }
        else
        {
            System.out.println("Invalid sides, cannot form a triangle");
        }
    }
}