import java.util.Scanner;

// Q5: Check if number is divisible by both 3 and 5, only 3, only 5, or None
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 3 == 0 && n % 5 == 0) ? "Divisible by both 3 and 5"
                      : (n % 3 == 0) ? "Divisible only by 3"
                      : (n % 5 == 0) ? "Divisible only by 5"
                      : "None";

        System.out.println(result);
        sc.close();
    }
}
