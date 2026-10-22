import java.util.Scanner;

public class Q13 {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int maxOfFour(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return max(arr[index], maxOfFour(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };

        System.out.println("Biggest number: " + maxOfFour(arr, 0));
        sc.close();
    }
}
