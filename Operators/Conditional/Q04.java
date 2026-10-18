import java.util.Scanner;

// Q4: Find Closest Person (Given positions of two persons x1, x2 relative to target)
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position of Target: ");
        int target = sc.nextInt();
        System.out.print("Enter position of Person 1: ");
        int p1 = sc.nextInt();
        System.out.print("Enter position of Person 2: ");
        int p2 = sc.nextInt();

        int d1 = Math.abs(p1 - target);
        int d2 = Math.abs(p2 - target);

        String closest = (d1 < d2) ? "Person 1 is closest" : (d2 < d1 ? "Person 2 is closest" : "Both are at equal distance");
        System.out.println(closest);
        sc.close();
    }
}
