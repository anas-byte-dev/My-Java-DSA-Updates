import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number (n1): ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number (n2): ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number (n3): ");
        int n3 = sc.nextInt();

        System.out.println("\nInitial: 1st=" + n1 + ", 2nd=" + n2 + ", 3rd=" + n3);

        // Swap 1st into 2nd, 2nd into 3rd, 3rd into 1st
        // Target: new_n1 = old_n3, new_n2 = old_n1, new_n3 = old_n2

        // a. With fourth variable
        int temp = n3;
        int a1 = temp;
        int a2 = n1;
        int a3 = n2;
        System.out.println("\na. Using 4th variable:");
        System.out.println("1st=" + a1 + ", 2nd=" + a2 + ", 3rd=" + a3);

        // b. Without fourth variable
        int x1 = n1, x2 = n2, x3 = n3;
        x1 = x1 + x2 + x3;
        x2 = x1 - (x2 + x3); // gets old x1
        x3 = x1 - (x2 + x3); // gets old x2
        x1 = x1 - (x2 + x3); // gets old x3
        System.out.println("\nb. Without 4th variable:");
        System.out.println("1st=" + x1 + ", 2nd=" + x2 + ", 3rd=" + x3);

        sc.close();
    }
}
