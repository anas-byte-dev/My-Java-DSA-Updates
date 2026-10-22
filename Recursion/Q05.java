public class Q05 {
    static long sumOfSquares(int n) {
        if (n == 1) return 1;
        return (long) n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        long result = sumOfSquares(100);
        System.out.println("Sum of squares from 1 to 100: " + result);
    }
}
