import java.util.Scanner;
import java.util.ArrayList;

public class Q14 {
    static boolean isKeith(int n) {
        String s = Integer.toString(n);
        int d = s.length();
        ArrayList<Integer> terms = new ArrayList<>();
        for (char ch : s.toCharArray()) terms.add(ch - '0');

        while (true) {
            int next = 0;
            for (int i = terms.size() - d; i < terms.size(); i++) {
                next += terms.get(i);
            }
            if (next == n) return true;
            if (next > n) return false;
            terms.add(next);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKeith(n)) System.out.println(n + " is a Keith number.");
        else System.out.println(n + " is NOT a Keith number.");
        sc.close();
    }
}
