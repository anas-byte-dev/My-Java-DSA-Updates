import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        if (n == rev) System.out.println(n + " is a Palindrome number.");
        else System.out.println(n + " is NOT a Palindrome number.");
        sc.close();
    }
}
