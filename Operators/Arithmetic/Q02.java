import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number (e.g. 578): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 578;

        System.out.println("Digits from Right to Left:");
        int temp = Math.abs(n);
        while (temp > 0) {
            int digit = temp % 10;
            System.out.println(digit);
            temp /= 10;
        }

        sc.close();
    }
}
