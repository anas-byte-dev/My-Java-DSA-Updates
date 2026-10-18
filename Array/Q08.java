import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        int count = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            sum += arr[i];
            count++;
        }

        double avg = (count == 0) ? 0 : (double) sum / count;
        System.out.println("Average of elements at even index: " + avg);
        sc.close();
    }
}
