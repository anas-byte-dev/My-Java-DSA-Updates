import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPronic = false;

        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) System.out.println(n + " is a Pronic number.");
        else System.out.println(n + " is NOT a Pronic number.");
        sc.close();
    }
}
