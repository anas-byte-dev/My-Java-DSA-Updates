import java.util.Scanner;

// Q14: Given three numbers, print them in sorted order (ascending)
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (default 9 2 7): ");
        int a = sc.hasNextInt() ? sc.nextInt() : 9;
        int b = sc.hasNextInt() ? sc.nextInt() : 2;
        int c = sc.hasNextInt() ? sc.nextInt() : 7;

        int min = (a <= b && a <= c) ? a : (b <= c ? b : c);
        int max = (a >= b && a >= c) ? a : (b >= c ? b : c);
        int mid = (a + b + c) - min - max;

        System.out.println("Ascending order: " + min + " " + mid + " " + max);
        sc.close();
    }
}
