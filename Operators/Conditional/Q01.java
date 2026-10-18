import java.util.Scanner;

// Q1: Check and print whether given number is an even number or not using conditional operator
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String res = (n % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(n + " is " + res);
        sc.close();
    }
}
