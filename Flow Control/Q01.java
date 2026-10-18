import java.util.Scanner;

// Q1: WAP to print big of two numbers using if else statement.
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Bigger number is: " + a);
        } else if (b > a) {
            System.out.println("Bigger number is: " + b);
        } else {
            System.out.println("Both numbers are equal: " + a);
        }

        sc.close();
    }
}
