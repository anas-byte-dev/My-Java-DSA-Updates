import java.util.Scanner;

// Q5: WAP to take three sides of a triangle and print it is a valid triangle or not using if else statement.
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid Triangle.");
        } else {
            System.out.println("NOT a Valid Triangle.");
        }

        sc.close();
    }
}
