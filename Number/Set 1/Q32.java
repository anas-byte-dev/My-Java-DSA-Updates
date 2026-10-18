import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String bin = Integer.toBinaryString(n);
        System.out.println("Binary: " + bin);
        sc.close();
    }
}
