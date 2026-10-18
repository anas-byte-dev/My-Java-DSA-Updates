import java.util.Scanner;

public class Q05 {
    static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end range: ");
        int start = sc.nextInt(), end = sc.nextInt();
        int count = 0;

        System.out.print("Perfect numbers: ");
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
        sc.close();
    }
}
