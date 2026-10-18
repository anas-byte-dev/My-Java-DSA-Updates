import java.util.Scanner;

// Platform: LeetCode - 2806. Account Balance After Rounded Purchase
public class Q10 {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount + 5) / 10) * 10;
        return 100 - rounded;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int purchaseAmount = sc.nextInt();

        System.out.println("Account balance after rounded purchase: " + accountBalanceAfterPurchase(purchaseAmount));
        sc.close();
    }
}
