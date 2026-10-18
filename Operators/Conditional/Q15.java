import java.util.Scanner;

// Q15: Print the biggest of four numbers
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int maxAB = (a > b) ? a : b;
        int maxCD = (c > d) ? c : d;
        int max = (maxAB > maxCD) ? maxAB : maxCD;

        System.out.println("Biggest of four numbers: " + max);
        sc.close();
    }
}
