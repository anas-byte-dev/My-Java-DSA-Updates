import java.util.Scanner;

// LeetCode 1323: Maximum 69 Number
public class Q24 {
    public static int maximum69Number(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number consisting of 6 and 9: ");
        int n = sc.nextInt();

        int result = maximum69Number(n);
        System.out.println("Maximum 69 Number: " + result);
        sc.close();
    }
}
