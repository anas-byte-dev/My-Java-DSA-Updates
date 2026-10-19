// Q7: WAP to print cube of each number from 1 to 100.
public class Q07 {
    public static void main(String[] args) {
        System.out.println("Cubes from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "^3 = " + ((long) i * i * i));
        }
    }
}
