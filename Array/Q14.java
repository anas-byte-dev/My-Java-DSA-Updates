import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String largest = "";
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.length() > largest.length()) largest = s;
        }

        System.out.println("Largest string by length: " + largest);
        sc.close();
    }
}
