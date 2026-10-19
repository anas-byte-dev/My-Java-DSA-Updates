// Q1: WAJP to print sum of all natural numbers from 1 to 100.
public class Q01 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers 1 to 100: " + sum);
    }
}
