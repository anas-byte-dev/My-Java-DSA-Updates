import java.util.Scanner;

// Q10: Print the smaller of two numbers
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int small = (a < b) ? a : b;
        System.out.println("Smaller number: " + small);
        sc.close();
    }
}
