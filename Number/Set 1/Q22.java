import java.util.Scanner;
import java.util.HashSet;

// LeetCode 202: Happy Number
public class Q22 {
    static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n)) System.out.println(n + " is a Happy Number.");
        else System.out.println(n + " is NOT a Happy Number.");
        sc.close();
    }
}
