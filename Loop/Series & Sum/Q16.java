// Q16: WAJP to print the sum of series: 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/100
public class Q16 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("Sum of harmonic series 1 to 100 = %.6f\n", sum);
    }
}
