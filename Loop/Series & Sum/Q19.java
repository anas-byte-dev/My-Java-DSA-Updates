// Q19: WAJP to print the sum of series: 1/1^2 + 1/2^2 + 1/3^2 + ... + 1/100^2
public class Q19 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / ((double) i * i);
        }
        System.out.printf("Sum of 1/n^2 (n=1 to 100) = %.6f (approaches pi^2/6)\n", sum);
    }
}
