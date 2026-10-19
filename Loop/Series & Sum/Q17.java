// Q17: WAJP to print the sum of series: 1/2 + 1/4 + 1/6 + 1/8 + ... + 1/100
public class Q17 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 2; i <= 100; i += 2) {
            sum += 1.0 / i;
        }
        System.out.printf("Sum of series 1/2 + 1/4 + ... + 1/100 = %.6f\n", sum);
    }
}
