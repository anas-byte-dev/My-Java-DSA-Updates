import java.util.Scanner;

// LeetCode 896: Monotonic Array
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean inc = true, dec = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) inc = false;
            if (arr[i] < arr[i + 1]) dec = false;
        }

        if (inc || dec) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
        sc.close();
    }
}
