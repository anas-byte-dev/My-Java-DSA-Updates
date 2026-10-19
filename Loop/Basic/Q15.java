// Q15: WAP to print and count all numbers from 1 to 100 which are divisible by 7 OR ends with 7.
public class Q15 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Numbers divisible by 7 or ending with 7 (1 to 100):");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
    }
}
