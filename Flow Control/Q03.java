import java.util.Scanner;

// Q3: WAP to take a character input and print it is alphabet or not using if else statement.
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("'" + ch + "' is an Alphabet.");
        } else {
            System.out.println("'" + ch + "' is NOT an Alphabet.");
        }

        sc.close();
    }
}
