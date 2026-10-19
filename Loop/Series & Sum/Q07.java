// Q7: WAJP to print sum of squares of all natural numbers from 1 to 100.
public class Q07 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (long) i * i;
        }
        System.out.println("Sum of squares 1 to 100: " + sum);
    }
}
