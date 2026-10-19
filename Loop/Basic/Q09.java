// Q9: WAP to print and count all the numbers from 1 to 100 which are perfect cubes.
public class Q09 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Perfect cubes between 1 and 100:");
        for (int i = 1; i * i * i <= 100; i++) {
            System.out.print((i * i * i) + " ");
            count++;
        }
        System.out.println("\nTotal perfect cubes: " + count);
    }
}
