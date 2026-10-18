import java.util.HashSet;

public class Q23 {
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
        int count = 0;
        System.out.print("Happy numbers up to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
    }
}
