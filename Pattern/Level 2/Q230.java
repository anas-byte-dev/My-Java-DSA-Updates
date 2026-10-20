import java.util.Scanner;

public class Q230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        long val = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(val + (i < n ? ", " : ""));
            if (i % 2 == 1) val = val + 1;
            else val = val * 3;
        }
        System.out.println();
        sc.close();
    }
}
