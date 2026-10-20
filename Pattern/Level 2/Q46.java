import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int total = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int start = total - (i * (i + 1) / 2) + 1;
            for (int j = 0; j < i; j++) {
                System.out.print((start + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
