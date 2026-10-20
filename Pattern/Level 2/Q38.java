import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 1) ? 1 : 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
