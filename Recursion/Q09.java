import java.util.Scanner;

public class Q09 {
    static void printRightToLeft(int n) {
        if (n == 0) return;
        System.out.println(n % 10);
        printRightToLeft(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printRightToLeft(n);
        sc.close();
    }
}
