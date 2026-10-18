import java.util.Scanner;

// Q13: Print second largest of three distinct numbers using ternary operator only
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three distinct numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int secondLargest = (a > b && a > c) ? ((b > c) ? b : c)
                          : (b > a && b > c) ? ((a > c) ? a : c)
                          : ((a > b) ? a : b);

        System.out.println("Second largest: " + secondLargest);
        sc.close();
    }
}
