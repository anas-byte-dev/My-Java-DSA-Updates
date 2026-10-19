// Q21: WAJP to print the sum of series: 1/(1*2) + 1/(2*3) + 1/(3*4) + ... + 1/(100*101)
// Note: Telescoping series = (1 - 1/2) + (1/2 - 1/3) + ... = 1 - 1/101 = 100/101
public class Q21 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / ((double) i * (i + 1));
        }
        System.out.printf("Sum of telescoping series = %.6f (Exact: 100/101 = %.6f)\n", sum, 100.0 / 101.0);
    }
}
