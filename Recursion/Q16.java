import java.util.Scanner;

// LeetCode 231: Power of Two
public class Q16 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is Power of Two: " + isPowerOfTwo(n));
        sc.close();
    }
}
