public class Q25 {
    static boolean isAutomorphic(long n) {
        long sq = n * n;
        return Long.toString(sq).endsWith(Long.toString(n));
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Automorphic numbers up to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount: " + count);
    }
}
