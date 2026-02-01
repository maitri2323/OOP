import java.util.Scanner;

class PasswordCheck {

    static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch))
                return false;

            if (Character.isDigit(ch))
                digitCount++;
        }

        return digitCount >= 2;
    }

    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        if (isValidPassword(pwd)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}