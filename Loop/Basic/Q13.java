import java.util.Scanner;

// Q13: Count Odd Numbers in an Interval Range (LeetCode 1523)
public class Q13 {
    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low: ");
        int low = sc.nextInt();
        System.out.print("Enter high: ");
        int high = sc.nextInt();

        System.out.println("Count of odd numbers in [" + low + ", " + high + "]: " + countOdds(low, high));
        sc.close();
    }
}
