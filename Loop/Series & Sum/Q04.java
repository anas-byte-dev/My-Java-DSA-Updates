// Q4: WAJP to print sum of all odd numbers from 1 to 100.
public class Q04 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to 100: " + sum);
    }
}
