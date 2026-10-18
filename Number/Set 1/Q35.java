import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal string: ");
        String oct = sc.next();

        int dec = Integer.parseInt(oct, 8);
        System.out.println("Decimal: " + dec);
        sc.close();
    }
}
