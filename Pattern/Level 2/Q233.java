import java.util.Scanner;

public class Q233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        long val = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(val + (i < n ? ", " : ""));
            val = 2 * val + 1;
        }
        System.out.println();
        sc.close();
    }
}
