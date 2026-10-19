// Q15: WAJP to print the sum of series: 1^2*2 + 2^2*3 + 3^2*4 + ... + 100^2*101
public class Q15 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += ((long) i * i) * (i + 1);
        }
        System.out.println("Sum of series 1^2*2 + 2^2*3 + ... = " + sum);
    }
}
