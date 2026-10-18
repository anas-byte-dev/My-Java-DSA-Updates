import java.util.Scanner;

public class Q14 {
    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0, num = 1;

        while (true) {
            if (isPalindrome(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th Palindrome number is: " + num);
                    break;
                }
            }
            num++;
        }
        sc.close();
    }
}
