import java.util.Scanner;

// Q9: Print the bigger of two numbers
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int big = (a > b) ? a : b;
        System.out.println("Bigger number: " + big);
        sc.close();
    }
}
