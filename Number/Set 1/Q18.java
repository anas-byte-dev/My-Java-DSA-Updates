import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }

        if (sum == n) System.out.println(n + " is an Armstrong number.");
        else System.out.println(n + " is NOT an Armstrong number.");
        sc.close();
    }
}
