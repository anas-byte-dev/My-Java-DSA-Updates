import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price (CP) [default 120]: ");
        double cp = sc.hasNextDouble() ? sc.nextDouble() : 120;
        System.out.print("Enter Selling Price (SP) [default 90]: ");
        double sp = sc.hasNextDouble() ? sc.nextDouble() : 90;

        if (cp > sp) {
            double loss = cp - sp;
            double lossPercent = (loss / cp) * 100;
            System.out.printf("Loss: %.2f\n", loss);
            System.out.printf("%% Loss: %.2f%%\n", lossPercent);
        } else {
            System.out.println("No loss incurred.");
        }

        sc.close();
    }
}
