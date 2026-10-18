import java.util.Scanner;

// LeetCode 2485: Find the Pivot Integer
public class Q25 {
    public static int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int x = (int) Math.sqrt(total);
        if (x * x == total) return x;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int pivot = pivotInteger(n);
        System.out.println("Pivot Integer: " + pivot);
        sc.close();
    }
}
