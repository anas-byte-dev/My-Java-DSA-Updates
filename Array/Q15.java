import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean strictlyInc = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                strictlyInc = false;
                break;
            }
        }

        if (strictlyInc) System.out.println("Array is strictly increasing");
        else System.out.println("Array is not strictly increasing");
        sc.close();
    }
}
