import java.util.Scanner;

// Q2: Check and print whether given positive number is a three-digit number or not
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        String res = (n >= 100 && n <= 999) ? "Three digit number" : "Not a three digit number";
        System.out.println(n + " is " + res);
        sc.close();
    }
}
