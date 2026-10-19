// Q11: WAJP to print sum of squares of all odd numbers from 1 to 100.
public class Q11 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += (long) i * i;
        }
        System.out.println("Sum of squares of odd numbers 1 to 100: " + sum);
    }
}
