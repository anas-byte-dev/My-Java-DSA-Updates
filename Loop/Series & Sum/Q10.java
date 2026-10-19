// Q10: WAJP to print sum of cubes of all even numbers from 1 to 100.
public class Q10 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += (long) i * i * i;
        }
        System.out.println("Sum of cubes of even numbers 1 to 100: " + sum);
    }
}
