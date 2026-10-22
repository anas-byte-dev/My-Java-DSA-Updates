import java.util.Scanner;

// LeetCode 342: Power of Four
public class Q18 {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is Power of Four: " + isPowerOfFour(n));
        sc.close();
    }
}
