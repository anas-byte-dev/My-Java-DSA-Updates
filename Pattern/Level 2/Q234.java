import java.util.Scanner;

public class Q234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int val = i * i - i + 1;
            System.out.print(val + (i < n ? ", " : ""));
        }
        System.out.println();
        sc.close();
    }
}
