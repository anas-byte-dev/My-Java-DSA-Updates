import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n + 1);

        if (sqrt * sqrt == n + 1) System.out.println(n + " is a Sunny number.");
        else System.out.println(n + " is NOT a Sunny number.");
        sc.close();
    }
}
