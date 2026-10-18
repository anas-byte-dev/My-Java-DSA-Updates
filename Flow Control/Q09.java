import java.util.Scanner;

// Q9: WAP to take total shopping price and provide discounted price as per conditions:
// 40% discount if price >= 10000
// 30% discount if price >= 6000
// 20% discount if price >= 3000
// 8% discount if price >= 1
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total shopping price: ");
        double price = sc.nextDouble();

        double discountRate = 0;
        if (price >= 10000) {
            discountRate = 0.40;
        } else if (price >= 6000) {
            discountRate = 0.30;
        } else if (price >= 3000) {
            discountRate = 0.20;
        } else if (price >= 1) {
            discountRate = 0.08;
        }

        double discountAmount = price * discountRate;
        double finalPrice = price - discountAmount;

        System.out.printf("Original Price: %.2f\n", price);
        System.out.printf("Discount Applied (%.0f%%): %.2f\n", (discountRate * 100), discountAmount);
        System.out.printf("Final Payable Price: %.2f\n", finalPrice);

        sc.close();
    }
}
