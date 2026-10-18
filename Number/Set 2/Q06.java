import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0, prod = 1;

        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }

        if (sum == prod) System.out.println(n + " is a Spy number.");
        else System.out.println(n + " is NOT a Spy number.");
        sc.close();
    }
}
