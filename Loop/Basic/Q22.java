import java.util.Scanner;

// Q22: The kth Factor of n (LeetCode 1492)
public class Q22 {
    public static int kthFactor(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("The " + k + "-th factor of " + n + " is: " + kthFactor(n, k));
        sc.close();
    }
}
