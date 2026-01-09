import java.util.Scanner;

public class PRAC6AddOneToDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int num = sc.nextInt();

        int d1 = (num / 10000 + 1) % 10;
        int d2 = ((num / 1000) % 10 + 1) % 10;
        int d3 = ((num / 100) % 10 + 1) % 10;
        int d4 = ((num / 10) % 10 + 1) % 10;
        int d5 = (num % 10 + 1) % 10;

        int result = (d1 * 10000) + (d2 * 1000) + (d3 * 100) + (d4 * 10) + d5;

        System.out.println("Result: " + result);
    }
}