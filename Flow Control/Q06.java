import java.util.Scanner;

// Q6: WAP to take three sides of a triangle and print it is equilateral, isosceles or scalene triangle or not using if else statement.
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle.");
            } else {
                System.out.println("Scalene Triangle.");
            }
        } else {
            System.out.println("Invalid Triangle sides.");
        }

        sc.close();
    }
}
