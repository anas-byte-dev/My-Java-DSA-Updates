import java.util.Scanner;

// [Amazon]
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row index n (0-indexed): ");
        int n = sc.nextInt();

        long c = 1;
        System.out.print("Row " + n + ": ");
        for (int j = 0; j <= n; j++) {
            System.out.print(c + " ");
            c = c * (n - j) / (j + 1);
        }
        System.out.println();
        sc.close();
    }
}
