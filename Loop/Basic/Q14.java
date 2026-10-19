// Q14: WAP to print and count all numbers from 1 to 100 which are divisible by 7.
public class Q14 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Numbers divisible by 7 from 1 to 100:");
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println("\nTotal count: " + count);
    }
}
