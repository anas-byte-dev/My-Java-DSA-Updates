import java.util.Scanner;

public class Q21 {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        return sum;
    }

    static boolean isSelfNumber(int n) {
        // A self number has no generator k such that k + digitSum(k) == n
        int start = Math.max(1, n - 9 * Integer.toString(n).length());
        for (int k = start; k < n; k++) {
            if (k + digitSum(k) == n) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isSelfNumber(n)) System.out.println(n + " is a Self Number.");
        else System.out.println(n + " is NOT a Self Number.");
        sc.close();
    }
}
