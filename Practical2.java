import java.util.Scanner;

class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;

        System.out.println("Enter value of a:");
        a = sc.nextDouble();

        System.out.println("Enter value of b:");
        b = sc.nextDouble();

        System.out.println("Enter value of c:");
        c = sc.nextDouble();

        System.out.println("Enter value of d:");
        d = sc.nextDouble();

        System.out.println("Enter value of e:");
        e = sc.nextDouble();

        System.out.println("Enter value of f:");
        f = sc.nextDouble();

        D = (a * d) - (b * c);
        Dx = (e * d) - (b * f);
        Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("No solution (Denominator is zero).");
        } else {
            x = Dx / D;
            y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }
    }
}
