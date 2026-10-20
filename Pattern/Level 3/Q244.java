import java.util.Scanner;

public class Q244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int offset = 0;
            for (int k = i + 1; k <= n; k++) offset += k;

            if ((n - i) % 2 == 0) {
                for (int j = i; j >= 1; j--) System.out.print((offset + j) + " ");
            } else {
                for (int j = 1; j <= i; j++) System.out.print((offset + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
