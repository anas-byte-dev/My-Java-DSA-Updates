import java.util.Scanner;

public class Q227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        long val = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(val + " ");
            val = 2 * val + 1;
        }
        System.out.println();
        sc.close();
    }
}
