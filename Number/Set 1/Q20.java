import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sum += (int) Math.pow(d, i + 1);
        }

        if (sum == n) System.out.println(n + " is a Disarium number.");
        else System.out.println(n + " is NOT a Disarium number.");
        sc.close();
    }
}
