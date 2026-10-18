import java.util.Scanner;

// Q4: WAP to take three angles of a triangle from user and print triangle is valid or not using if else statement.
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180.0)) {
            System.out.println("Valid Triangle.");
        } else {
            System.out.println("NOT a Valid Triangle.");
        }

        sc.close();
    }
}
