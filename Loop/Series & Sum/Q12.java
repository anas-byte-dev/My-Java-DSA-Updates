// Q12: WAJP to print sum of cubes of all odd numbers from 1 to 100.
public class Q12 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += (long) i * i * i;
        }
        System.out.println("Sum of cubes of odd numbers 1 to 100: " + sum);
    }
}
