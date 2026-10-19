// Q5: WAP to print and count all the numbers from 1 to 100 which are perfect squares.
public class Q05 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Perfect squares between 1 and 100:");
        for (int i = 1; i * i <= 100; i++) {
            System.out.print((i * i) + " ");
            count++;
        }
        System.out.println("\nTotal perfect squares: " + count);
    }
}
