import java.util.Scanner;

public class Q20 {
    static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Palindrome numbers in array: ");
        for (int val : arr) {
            if (isPalindrome(val)) System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}
