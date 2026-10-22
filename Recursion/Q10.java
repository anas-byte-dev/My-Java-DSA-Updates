import java.util.Scanner;

public class Q10 {
    static void printLeftToRight(int n) {
        if (n == 0) return;
        printLeftToRight(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printLeftToRight(n);
        sc.close();
    }
}
