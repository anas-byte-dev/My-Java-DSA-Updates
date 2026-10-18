import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String oct = Integer.toOctalString(n);
        System.out.println("Octal: " + oct);
        sc.close();
    }
}
