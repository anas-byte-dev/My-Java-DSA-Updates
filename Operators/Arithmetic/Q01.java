import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (default 5783): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5783;

        // a. Print the last digit
        int lastDigit = n % 10;
        System.out.println("a. Last digit: " + lastDigit);

        // b. Print the last two digits
        int lastTwoDigits = n % 100;
        System.out.println("b. Last two digits: " + lastTwoDigits);

        // c. Remove the last digit
        int removeLastDigit = n / 10;
        System.out.println("c. Number after removing last digit: " + removeLastDigit);

        // d. Remove the last two digits
        int removeLastTwoDigits = n / 100;
        System.out.println("d. Number after removing last two digits: " + removeLastTwoDigits);

        sc.close();
    }
}
