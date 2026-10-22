public class Q06 {
    static long sumOfCubes(int n) {
        if (n == 1) return 1;
        return (long) n * n * n + sumOfCubes(n - 1);
    }

    public static void main(String[] args) {
        long result = sumOfCubes(100);
        System.out.println("Sum of cubes from 1 to 100: " + result);
    }
}
