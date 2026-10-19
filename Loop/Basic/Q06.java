import java.util.Scanner;

// Q6: Bulb Switcher (LeetCode 319)
public class Q06 {
    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bulbs (n): ");
        int n = sc.nextInt();
        System.out.println("Number of bulbs left ON: " + bulbSwitch(n));
        sc.close();
    }
}
