import java.util.Scanner;

public class Q232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        long a = 0, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            long d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        System.out.println();
        sc.close();
    }
}
