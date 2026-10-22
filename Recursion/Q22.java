import java.util.Scanner;

public class Q22 {
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) return;
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.println("Steps to solve Tower of Hanoi:");
        towerOfHanoi(n, 'A', 'C', 'B');
        sc.close();
    }
}
