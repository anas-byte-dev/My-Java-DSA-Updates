import java.util.Scanner;

public class Q19 {
    static boolean isArmstrong(int n) {
        int temp = n, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Armstrong numbers up to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
    }
}
