import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Three-digit numbers: ");
        for (int val : arr) {
            int abs = Math.abs(val);
            if (abs >= 100 && abs <= 999) {
                System.out.print(val + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
        sc.close();
    }
}
