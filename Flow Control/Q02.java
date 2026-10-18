import java.util.Scanner;

// Q2: WAP to print all are equal if all have same value or print biggest value of three numbers using if else statement.
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal: " + a);
        } else {
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            System.out.println("Biggest value is: " + max);
        }

        sc.close();
    }
}
