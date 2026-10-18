import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean strictlyDec = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                strictlyDec = false;
                break;
            }
        }

        if (strictlyDec) System.out.println("Array is strictly decreasing");
        else System.out.println("Array is not strictly decreasing");
        sc.close();
    }
}
