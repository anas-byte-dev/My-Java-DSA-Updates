import java.util.Scanner;

public class Q19 {
    static boolean isTech(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        if (len % 2 != 0) return false;

        int half = len / 2;
        int left = Integer.parseInt(s.substring(0, half));
        int right = Integer.parseInt(s.substring(half));

        int sum = left + right;
        return (sum * sum) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isTech(n)) System.out.println(n + " is a Tech Number.");
        else System.out.println(n + " is NOT a Tech Number.");
        sc.close();
    }
}
