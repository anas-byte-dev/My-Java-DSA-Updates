import java.util.Scanner;

// Q6: Minimum Add to Make Parentheses Valid (LeetCode 921)
public class Q06 {
    public static int minAddToMakeValid(String s) {
        int openNeeded = 0;
        int closeNeeded = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                closeNeeded++;
            } else {
                if (closeNeeded > 0) closeNeeded--;
                else openNeeded++;
            }
        }
        return openNeeded + closeNeeded;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string (e.g. ()): ");
        String s = sc.hasNext() ? sc.next() : "())";
        System.out.println("Minimum additions needed: " + minAddToMakeValid(s));
        sc.close();
    }
}
