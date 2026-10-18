import java.util.Scanner;

// Q7: Check whether the three sides of a triangle are valid or not
public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        boolean isValid = (a + b > c) && (a + c > b) && (b + c > a);
        String res = isValid ? "Valid Triangle" : "Not a Valid Triangle";
        System.out.println(res);
        sc.close();
    }
}
