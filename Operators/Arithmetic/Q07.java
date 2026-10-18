import java.util.Scanner;

// Platform: LeetCode - 2235. Add Two Integers
public class Q07 {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + sum(num1, num2));
        sc.close();
    }
}
