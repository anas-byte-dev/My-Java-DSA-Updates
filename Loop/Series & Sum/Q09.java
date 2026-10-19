// Q9: WAJP to print sum of squares of all even numbers from 1 to 100.
public class Q09 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += (long) i * i;
        }
        System.out.println("Sum of squares of even numbers 1 to 100: " + sum);
    }
}
