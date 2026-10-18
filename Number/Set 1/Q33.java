import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String bin = sc.next();

        int dec = Integer.parseInt(bin, 2);
        System.out.println("Decimal: " + dec);
        sc.close();
    }
}
