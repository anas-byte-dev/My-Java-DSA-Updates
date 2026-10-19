// Q14: WAJP to print the sum of series: 1*2^2 + 2*3^2 + 3*4^2 + ... + 100*101^2
public class Q14 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            long next = i + 1;
            sum += (long) i * next * next;
        }
        System.out.println("Sum of series 1*2^2 + 2*3^2 + ... = " + sum);
    }
}
