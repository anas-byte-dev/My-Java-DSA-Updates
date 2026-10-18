import java.util.Scanner;

// Q3: Minimum Cuts to Divide a Circle (LeetCode 2481)
public class Q03 {
    public static int numberOfCuts(int n) {
        return (n == 1) ? 0 : (n % 2 == 0 ? n / 2 : n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of equal slices (n): ");
        int n = sc.nextInt();

        System.out.println("Minimum cuts needed: " + numberOfCuts(n));
        sc.close();
    }
}
