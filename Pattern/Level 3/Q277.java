import java.util.Scanner;

public class Q277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.hasNextInt() ? sc.nextInt() : 7;
        int top = 4;

        for (int i = 1; i <= 3; i++) {
            for (int k = 0; k < 3; k++) {
                for (int s = 1; s <= top - 1; s++) System.out.print(" ");
                System.out.print("*");
                for (int s = 1; s <= top - 1; s++) System.out.print(" ");
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = top; i >= 1; i--) {
            for (int k = 0; k < 3; k++) {
                for (int s = 1; s <= top - i; s++) System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
                for (int s = 1; s <= top - i; s++) System.out.print(" ");
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
