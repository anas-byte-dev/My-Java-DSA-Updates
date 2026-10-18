import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price (CP) [default 120]: ");
        double cp = sc.hasNextDouble() ? sc.nextDouble() : 120;
        System.out.print("Enter Selling Price (SP) [default 160]: ");
        double sp = sc.hasNextDouble() ? sc.nextDouble() : 160;

        if (sp > cp) {
            double profit = sp - cp;
            double profitPercent = (profit / cp) * 100;
            System.out.printf("Profit: %.2f\n", profit);
            System.out.printf("%% Profit: %.2f%%\n", profitPercent);
        } else {
            System.out.println("No profit earned.");
        }

        sc.close();
    }
}
