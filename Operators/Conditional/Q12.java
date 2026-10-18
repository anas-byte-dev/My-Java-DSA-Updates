import java.util.Scanner;

// Q12: Print the smallest of three numbers
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = (a < b && a < c) ? a : (b < c ? b : c);
        System.out.println("Smallest: " + min);
        sc.close();
    }
}
