import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Row: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            long c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
