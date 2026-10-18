import java.util.Scanner;

public class Q21 {
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
        int count = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isPalindrome(arr[i])) count++;
        }

        System.out.println("Count of palindrome numbers in array: " + count);
        sc.close();
    }
}
