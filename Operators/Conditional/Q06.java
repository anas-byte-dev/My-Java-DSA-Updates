import java.util.Scanner;

// Q6: For given numbers x and y, check whether y is a factor of x or not
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        String ans = (y != 0 && x % y == 0) ? (y + " is a factor of " + x) : (y + " is not a factor of " + x);
        System.out.println(ans);
        sc.close();
    }
}
