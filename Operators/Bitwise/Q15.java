import java.util.Scanner;

// Q15: WAJP to check whether a number is Even or Odd without using % operator
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println(n + " is EVEN.");
        } else {
            System.out.println(n + " is ODD.");
        }

        sc.close();
    }
}
