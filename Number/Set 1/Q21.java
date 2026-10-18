import java.util.Scanner;

public class Q21 {
    static boolean isDisarium(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sum += (int) Math.pow(d, i + 1);
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isDisarium(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal Disarium count: " + count);
        sc.close();
    }
}
