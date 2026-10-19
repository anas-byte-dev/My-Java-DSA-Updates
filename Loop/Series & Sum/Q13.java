// Q13: WAJP to print the sum of series: 1*2 + 2*3 + 3*4 + ... + 100*101
public class Q13 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (long) i * (i + 1);
        }
        System.out.println("Sum of series 1*2 + 2*3 + ... + 100*101 = " + sum);
    }
}
