public class Q04 {
    static int sum1To100(int n) {
        if (n == 1) return 1;
        return n + sum1To100(n - 1);
    }

    public static void main(String[] args) {
        int result = sum1To100(100);
        System.out.println("Sum of numbers from 1 to 100: " + result);
    }
}
