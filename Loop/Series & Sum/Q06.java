import java.util.Scanner;

// Q6: Divisible and Non-divisible Sums Difference (LeetCode 2894)
public class Q06 {
    public static int differenceOfSums(int n, int m) {
        int num1 = 0; // not divisible by m
        int num2 = 0; // divisible by m
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) num1 += i;
            else num2 += i;
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.println("Difference of sums: " + differenceOfSums(n, m));
        sc.close();
    }
}
