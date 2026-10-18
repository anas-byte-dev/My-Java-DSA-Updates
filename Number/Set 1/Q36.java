import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String hex = Integer.toHexString(n).toUpperCase();
        System.out.println("Hexadecimal: " + hex);
        sc.close();
    }
}
