// Q8: WAP to print all the numbers from 1 to 100 which are perfect cubes.
public class Q08 {
    public static void main(String[] args) {
        System.out.println("Perfect cubes between 1 and 100:");
        for (int i = 1; i * i * i <= 100; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}
