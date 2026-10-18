import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Elements at even index: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
