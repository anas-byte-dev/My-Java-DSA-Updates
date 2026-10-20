import java.util.Scanner;

public class Q268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int val = 1;

        while (val <= n * n) {
            for (int j = left; j <= right; j++) matrix[top][j] = val++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = val++;
            right--;
            for (int j = right; j >= left; j--) matrix[bottom][j] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = val++;
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
