// Q18: WAJP to print the sum of series: 1/1 + 1/3 + 1/5 + 1/7 + ... upto 100 terms
public class Q18 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int term = 1; term <= 100; term++) {
            int denom = 2 * term - 1;
            sum += 1.0 / denom;
        }
        System.out.printf("Sum of odd reciprocals (100 terms) = %.6f\n", sum);
    }
}
