import java.util.Scanner;

// Platform: LeetCode - 2651. Calculate Delayed Arrival Time
public class Q08 {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrival time (0-23): ");
        int arrivalTime = sc.nextInt();
        System.out.print("Enter delayed time: ");
        int delayedTime = sc.nextInt();

        System.out.println("Actual arrival time: " + findDelayedArrivalTime(arrivalTime, delayedTime));
        sc.close();
    }
}
