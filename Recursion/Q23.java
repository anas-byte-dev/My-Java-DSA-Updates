import java.util.Scanner;

// LeetCode 263: Ugly Number
public class Q23 {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 == 0) return isUgly(n / 2);
        if (n % 3 == 0) return isUgly(n / 3);
        if (n % 5 == 0) return isUgly(n / 5);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is Ugly Number: " + isUgly(n));
        sc.close();
    }
}
