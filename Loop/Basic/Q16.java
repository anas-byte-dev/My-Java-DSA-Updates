// Q16: WAP to print and count all numbers from 1 to 1000 which are divisible by 7 AND also ends with 7.
public class Q16 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Numbers divisible by 7 AND ending with 7 (1 to 1000):");
        for (int i = 7; i <= 1000; i += 10) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
    }
}
