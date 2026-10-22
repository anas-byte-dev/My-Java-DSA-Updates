import java.util.Scanner;

public class Q03 {
    static void printTable(int n, int i) {
        if (i > 10) return;
        System.out.println(n + " x " + i + " = " + (n * i));
        printTable(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        printTable(n, 1);
        sc.close();
    }
}
