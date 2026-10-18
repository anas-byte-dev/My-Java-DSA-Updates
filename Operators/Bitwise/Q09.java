// Q9: What is the value of the expression 18 & ~18?
// Options: a) 1  b) 0  c) -1  d) none
// Answer: b) 0 (No bits can be simultaneously 1 in both n and ~n)
public class Q09 {
    public static void main(String[] args) {
        int res = 18 & ~18;
        System.out.println("18 & ~18 = " + res);
        System.out.println("For any integer n, n & ~n = 0 (no common 1-bits).");
    }
}
