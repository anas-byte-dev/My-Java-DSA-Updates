import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String s = sc.next();

        if (s.charAt(0) != '0' && s.contains("0")) {
            System.out.println(s + " is a Duck number.");
        } else {
            System.out.println(s + " is NOT a Duck number.");
        }
        sc.close();
    }
}
