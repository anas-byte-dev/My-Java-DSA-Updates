// Q20: WAJP to print the sum of series: 1/1^3 + 1/2^3 + 1/3^3 + ... + 1/100^3
public class Q20 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / ((double) i * i * i);
        }
        System.out.printf("Sum of 1/n^3 (n=1 to 100) = %.6f\n", sum);
    }
}
