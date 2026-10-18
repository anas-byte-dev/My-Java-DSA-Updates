import java.util.Scanner;

// Q8: WAP to take CP and SP and print %Profit or %Loss in the transaction.
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price (CP): ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price (SP): ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            double profitPercent = (profit / cp) * 100;
            System.out.printf("Profit: %.2f (%% Profit: %.2f%%)\n", profit, profitPercent);
        } else if (cp > sp) {
            double loss = cp - sp;
            double lossPercent = (loss / cp) * 100;
            System.out.printf("Loss: %.2f (%% Loss: %.2f%%)\n", loss, lossPercent);
        } else {
            System.out.println("No Profit, No Loss.");
        }

        sc.close();
    }
}
