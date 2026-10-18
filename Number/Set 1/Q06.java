import java.util.Scanner;

public class Q06 {
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int count = 0, num = 1;

        while (true) {
            if (isPerfect(num)) {
                count++;
                if (count == k) {
                    System.out.println(k + "th Perfect Number is: " + num);
                    break;
                }
            }
            num++;
        }
        sc.close();
    }
}
