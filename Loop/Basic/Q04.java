// Q4: WAP to print all numbers from 1 to 100 which are perfect squares.
public class Q04 {
    public static void main(String[] args) {
        System.out.println("Perfect squares between 1 and 100:");
        for (int i = 1; i * i <= 100; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}
