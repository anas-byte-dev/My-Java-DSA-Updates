import java.util.Scanner;

// Q16: Print the smallest of four numbers
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int minAB = (a < b) ? a : b;
        int minCD = (c < d) ? c : d;
        int min = (minAB < minCD) ? minAB : minCD;

        System.out.println("Smallest of four numbers: " + min);
        sc.close();
    }
}
