import java.util.Scanner;

// Q11: Print the biggest of three numbers
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Biggest: " + max);
        sc.close();
    }
}
