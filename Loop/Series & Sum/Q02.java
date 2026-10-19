import java.util.Scanner;

// Q2: WAJP to get sum of all natural numbers in a range (e.g. start=120, end=180).
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start (default 120): ");
        int start = sc.hasNextInt() ? sc.nextInt() : 120;
        System.out.print("Enter end (default 180): ");
        int end = sc.hasNextInt() ? sc.nextInt() : 180;

        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
        sc.close();
    }
}
