import java.util.Scanner;

// Q21: Three Divisors (LeetCode 1952)
public class Q21 {
    public static boolean isThree(int n) {
        // A number has exactly 3 positive divisors iff it is the square of a prime number.
        int root = (int) Math.sqrt(n);
        if (root * root != n) return false;
        
        if (root <= 1) return false;
        for (int i = 2; i * i <= root; i++) {
            if (root % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Has exactly three divisors: " + isThree(n));
        sc.close();
    }
}
