import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long sq = n * n;
        String sNum = Long.toString(n);
        String sSq = Long.toString(sq);

        if (sSq.endsWith(sNum)) System.out.println(n + " is an Automorphic number.");
        else System.out.println(n + " is NOT an Automorphic number.");
        sc.close();
    }
}
