import java.util.Scanner;

public class PRAC5ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int n100 = amount/100;
        amount = amount%100;

        int n50 = amount/50;
        amount = amount%50;

        int n10 = amount/10;
        amount = amount%10;

        int n5 = amount/5;
        amount = amount%5;

        int n2 = amount/2;
        amount = amount%2;

        int n1 = amount;

        System.out.println("100 notes: " + n100);
        System.out.println("50 notes: " + n50);
        System.out.println("10 notes: " + n10);
        System.out.println("5 coins: " + n5);
        System.out.println("2 coins: " + n2);
        System.out.println("1 coins: " + n1);
    }
}