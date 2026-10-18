import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\n--- Initial Values ---");
        System.out.println("a = " + a + ", b = " + b);

        // a. Using third variable
        int temp = a;
        int swappedA = b;
        int swappedB = temp;
        System.out.println("\na. Swapped using 3rd variable:");
        System.out.println("a = " + swappedA + ", b = " + swappedB);

        // b. Without using third variable (arithmetic)
        int x = a;
        int y = b;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("\nb. Swapped without 3rd variable:");
        System.out.println("a = " + x + ", b = " + y);

        sc.close();
    }
}
