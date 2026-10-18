import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;
        int count = 0;
        System.out.print("Elements bigger than average (" + avg + "): ");
        for (int val : arr) {
            if (val > avg) {
                System.out.print(val + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
        sc.close();
    }
}
